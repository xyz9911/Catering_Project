package com.hit.catering_project.Service;

import com.hit.catering_project.DAO.OrderNoticeDao;
import com.hit.catering_project.DAO.OrdersDao;
import com.hit.catering_project.DAO.RiderDao;
import com.hit.catering_project.DAO.RiderViewDao;
import com.hit.catering_project.Entities.RiderViewEntity;
import com.hit.catering_project.Entities.StudentViewEntity;
import com.hit.catering_project.Request.OrderDish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class RiderService {
    @Autowired
    private RiderDao riderDao;
    @Autowired
    private RiderViewDao riderViewDao;
    @Autowired
    private OrdersDao ordersDao;
    @Autowired
    private OrderNoticeDao orderNoticeDao;
    @Autowired
    private RedisService redisService;

    public String riderLogin(String name,String password){
        if(riderDao.riderLogin(name, password)==1){
            String token = UUID.randomUUID().toString();
            redisService.set(token, name);
            return token;
        }
        else
            return "";
    }

    public RiderViewEntity getRiderInfo(int rid){
        return riderViewDao.findByRid(rid);
    }

    public List<Object> getTakableOrders(){
        return ordersDao.getTakableOrders();
    }

    @Transactional(rollbackFor = Exception.class)
    public int takeOrder(int rid,int oid) throws Exception {
        //会回滚
        if(ordersDao.riderTakeOrder(rid,oid)==0){
            throw new Exception("take error");
        }
        if(orderNoticeDao.updateNotice(oid," order taken by rider, oid: "+oid)==0){
            throw new Exception("notice error!");
        }
        return 1;
    }
}
