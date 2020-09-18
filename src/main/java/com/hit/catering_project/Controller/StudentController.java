package com.hit.catering_project.Controller;

import com.hit.catering_project.Entities.*;
import com.hit.catering_project.Request.OrderDish;
import com.hit.catering_project.Service.StudentService;
import com.hit.catering_project.Show.DishViewInfo;
import com.hit.catering_project.Show.ShoppingCarInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "stu/log",method = RequestMethod.GET)
    public String stuLogin(@RequestParam("name")String name,@RequestParam("password")String password){
        return studentService.stuLogin(name,password);
    }

    @RequestMapping(value = "stu/info/{sid}",method = RequestMethod.GET)
    public StudentViewEntity showStuInfo(@PathVariable("sid")int sid){
        return studentService.getStuInfo(sid);
    }

    @RequestMapping(value = "stu/dishview",method = RequestMethod.GET)
    public List<DishViewEntity> showAllDishView(){
        return studentService.getAllDishView();
    }

    @RequestMapping(value = "stu/window/{wid}",method = RequestMethod.GET)
    public List<DishEntity> showDishByWindow(@PathVariable("wid")int wid){
        return studentService.getDishByWindow(wid);
    }

    @RequestMapping(value = "stu/createorder/{sid}/{wid}",method = RequestMethod.PUT)
    public int createOrder(@RequestBody List<OrderDish> orderDishes,@PathVariable("sid")int sid,@PathVariable("wid")int wid) throws Exception {
        return studentService.createOrder(orderDishes,wid,sid);
    }

    @RequestMapping(value = "stu/cancelorder/{oid}",method = RequestMethod.PUT)
    public int cancelOrder(@PathVariable("oid")int oid){
        return studentService.cancelOrder(oid);
    }

    @RequestMapping(value = "stu/ordernotice/{sid}",method = RequestMethod.GET)
    public List<OrderUpdNoticeEntity> getOrderNotice(@PathVariable("sid")int sid){
        return studentService.getUnreadOrderNotice(sid);
    }

    @RequestMapping(value = "stu/readorder/{sid}",method = RequestMethod.PUT)
    public int readOrderNotice(@PathVariable("sid")int sid){
        return studentService.readOrderNotice(sid);
    }

    @RequestMapping(value = "stu/dishnotice/{sid}",method = RequestMethod.GET)
    public List<NewDishNoticeEntity> getDishNotice(@PathVariable("sid")int sid){
        return studentService.getUnreadDishNotice(sid);
    }

    @RequestMapping(value = "stu/readdish/{sid}",method = RequestMethod.PUT)
    public int readDishNotice(@PathVariable("sid")int sid){
        return studentService.readDishNotice(sid);
    }

    @RequestMapping(value = "stu/orders/{sid}",method = RequestMethod.GET)
    public List<OrdersViewEntity> getHistoryOrders(@PathVariable("sid")int sid){
        return studentService.browseOrders(sid);
    }

    @RequestMapping(value = "stu/allorders/{sid}",method = RequestMethod.GET)
    public List<OrdersEntity> getAllOrders(@PathVariable("sid")int sid){
        return studentService.getAllOrders(sid);
    }

    @RequestMapping(value = "stu/orderinfo/{oid}/{sid}",method = RequestMethod.GET)
    public List<Object> showOrderInfo(@PathVariable("oid")int oid,@PathVariable("sid")int sid){
        return studentService.getOrderInfo(oid, sid);
    }

    @RequestMapping(value = "stu/comment/{oid}",method = RequestMethod.PUT)
    public int commentOrder(@PathVariable("oid")int oid,@RequestParam("wrate")String wrate,@RequestParam("rrate")String rrate){
        Byte rate1=Byte.parseByte(wrate);
        Byte rate2=Byte.parseByte(rrate);
        return studentService.commentOrder(oid,rate1,rate2);
    }

    @RequestMapping(value = "stu/canteen",method = RequestMethod.GET)
    public List<CanteenEntity> showAllCanteens(){
        return studentService.findAllCanteens();
    }

    @RequestMapping(value = "stu/canteen/{cid}",method = RequestMethod.GET)
    public CanteenEntity showCanteen(@PathVariable("cid")int cid){
        return studentService.findCanteenById(cid);
    }

    @RequestMapping(value = "stu/canteen/shoppingcar",method = RequestMethod.GET)
    public ShoppingCarInfo showShoppingCar(@RequestParam("sid")int sid,@RequestParam("cid")int cid){
        return studentService.getShoppingCarInfo(sid, cid);
    }

    @RequestMapping(value = "stu/canteen/shoppingcar/delete",method = RequestMethod.GET)
    public int deleteShoppingCarGoods(@RequestParam("sid")int sid,@RequestParam("did")int did){
        return studentService.deleteShoppingGoods(sid,did);
    }

    @RequestMapping(value = "stu/canteen/shoppingcar/add",method = RequestMethod.GET)
    public int insertShoppingCarGoods(@RequestParam("sid")int sid,@RequestParam("did")int did){
        return studentService.addShoppingGoods(sid,did);
    }

    @RequestMapping(value = "stu/dish/info/{did}",method = RequestMethod.GET)
    public DishViewInfo showDishInfo(@PathVariable("did")int did){
        return studentService.getDishDetail(did);
    }
}
