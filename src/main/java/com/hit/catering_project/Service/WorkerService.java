package com.hit.catering_project.Service;

import com.hit.catering_project.DAO.*;
import com.hit.catering_project.Entities.*;
import com.hit.catering_project.Request.OrderDish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class WorkerService {
    @Autowired
    private WorkerDao workerDao;
    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private WorkerViewDao workerViewDao;
    @Autowired
    private DishDao dishDao;
    @Autowired
    private OrderNoticeDao orderNoticeDao;
    @Autowired
    private OrderViewDao orderViewDao;
    @Autowired
    private OrdersDao ordersDao;
    @Autowired
    private RedisService redisService;

    public String workerLogin(String name,String password){
        if(workerDao.wrkLogin(name, password)==1){
            String token = UUID.randomUUID().toString();
            redisService.set(token, name);
            return token;
        }
        else
            return "";
    }

    public WorkerViewEntity getWorkerInfo(int wid){
        return workerViewDao.findByWid(wid);
    }

    @Transactional(rollbackFor = Exception.class)
    public int createDish(int wid,String dname,Double dprice) throws Exception {
        //会回滚
        BigDecimal price = new BigDecimal(dprice);
        if(dishDao.createDish(wid,dname,price)==0){
            throw new Exception("create error");
        }
        if(dishDao.insertNotice("new dish "+dname+" released, price: "+price)==0){
                throw new Exception("notice error!");
        }
        if(dishDao.insertRelation()==0){
            throw new Exception("notice relation error");
        }
        return 1;
    }

    public List<OrderUpdNoticeEntity> getUnreadOrderNotice(int wid){
        return orderNoticeDao.getWorkerUnreadNotice(wid);
    }

    @Transactional
    public int readOrderNotice(int wid){
        return orderNoticeDao.readWorkerAllNotice(wid);
    }

    @Transactional
    public int updateDishStatus(int ava,int did){
        Byte yes=1;
        Byte no=0;
        if(ava==1){
            return dishDao.updateDishStatus(yes,did);
        }
        else {
            return dishDao.updateDishStatus(no,did);
        }
    }

    @Transactional
    public int deleteDish(int did){
        return dishDao.deleteDish(did);
    }

    public List<OrdersViewEntity> browseOrders(int wid){
        return orderViewDao.findByWid(wid);
    }

    public List<OrdersEntity> getAllOrders(int wid){
        Byte is=0;
        return ordersDao.findByWidAndIscanceledAndAndIstaken(wid,is,is);
    }

    public List<Object> getOrderInfo(int oid,int wid){
        return ordersDao.getWorkerOrderInfo(oid, wid);
    }

    @Transactional(rollbackFor = Exception.class)
    public int takeOrder(int oid) throws Exception {
        //会回滚
        if(ordersDao.takeOrder(oid)==0){
            throw new Exception("take order error");
        }
        if(studentDAO.spendBalance(oid)==0){
            throw new Exception("spend error!");
        }
        if(workerDao.addBalance(oid)==0){
            throw new Exception("add error");
        }
        if(orderNoticeDao.updateNotice(oid,"order taken, id:"+oid)==0){
            throw new Exception("notice error");
        }
        return 1;
    }

    public List<WorkerViewEntity> getWindowByCanteen(int cid){
        return workerViewDao.findByCid(cid);
    }
}
