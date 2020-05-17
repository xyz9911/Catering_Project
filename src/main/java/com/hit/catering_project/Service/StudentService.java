package com.hit.catering_project.Service;

import com.hit.catering_project.DAO.*;
import com.hit.catering_project.Entities.*;
import com.hit.catering_project.Request.OrderDish;
import com.hit.catering_project.Show.OrderInfo;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService{
    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private DishDao dishDao;
    @Autowired
    private DishViewDao dishViewDao;
    @Autowired
    private StudentViewDAO studentViewDAO;
    @Autowired
    private OrdersDao ordersDao;
    @Autowired
    private OrderNoticeDao orderNoticeDao;
    @Autowired
    private DishNoticeDao dishNoticeDao;
    @Autowired
    private OrderViewDao orderViewDao;
    public int stuLogin(String name,String password){
        return studentDAO.stuLogin(name,password);
    }

    public StudentViewEntity getStuInfo(int sid){
        return studentViewDAO.findBySid(sid);
    }

    public List<DishViewEntity> getAllDishView(){
        return dishViewDao.findAll();
    }

    public List<DishEntity> getDishByWindow(int wid){
        Byte delete=0;
        return dishDao.findByWidAndIsdelete(wid,delete);
    }

    public List<DishViewEntity> getDishViewByName(String name){
        return dishViewDao.findByWnameContains(name);
    }

    @Transactional(rollbackFor = Exception.class)
    public int createOrder(List<OrderDish> orderDishes,int wid,int sid) throws Exception {
        //会回滚
        BigDecimal price = new BigDecimal("0.00");
        for(OrderDish orderDish:orderDishes){
            price=price.add(dishDao.getPrice(orderDish.did).multiply(BigDecimal.valueOf(orderDish.servings)));
        }
        if(ordersDao.createOrder(sid,wid,price)==0){
            throw new Exception("create error");
        }
        for(OrderDish orderDish:orderDishes){
            if(ordersDao.createRelation(orderDish.did,orderDish.servings)==0){
                throw new Exception("relation error!");
            }
        }
        if(ordersDao.createNotice("order created")==0){
            throw new Exception("notice error");
        }
        return 1;
    }

    @Transactional
    public int cancelOrder(int oid){
        return ordersDao.cancelOrder(oid);
    }

    public List<OrderUpdNoticeEntity> getUnreadOrderNotice(int sid){
        return orderNoticeDao.getUnreadNotice(sid);
    }

    @Transactional
    public int readOrderNotice(int sid){
        return orderNoticeDao.readAllNotice(sid);
    }

    public List<NewDishNoticeEntity> getUnreadDishNotice(int sid){
        return dishNoticeDao.getUnreadNotice(sid);
    }

    @Transactional
    public int readDishNotice(int sid){
        return dishNoticeDao.readAllNotice(sid);
    }

    public List<OrdersViewEntity> browseOrders(int sid){
        return orderViewDao.findBySid(sid);
    }

    public List<Object> getOrderInfo(int oid,int sid){
        return ordersDao.getOrderInfo(oid, sid);
        //OrderInfo orderInfo=new OrderInfo();
        //Object object=ordersDao.getOrderInfo(oid,sid);
        //System.out.println(object);
        //if (object instanceof List<?>) {
        //    for (Object o : (List<?>) object) {
        //        orderInfo.dname=(String.class.cast(o));
        //    }
        //}
        //orderInfo.dname=object;
    }

    @Transactional
    public int commentOrder(int oid,Byte wrate,Byte rrate){
        return ordersDao.commentOrder(oid, wrate, rrate);
    }

    public List<OrdersEntity> getAllOrders(int sid){
        Byte is=0;
        return ordersDao.findBySidAndIscanceledAndAndIstaken(sid,is,is);
    }
}
