package com.hit.catering_project.Controller;

import com.hit.catering_project.Entities.*;
import com.hit.catering_project.Request.OrderDish;
import com.hit.catering_project.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @RequestMapping(value = "wrk/log",method = RequestMethod.GET)
    public int wrkLogin(@RequestParam("name")String name, @RequestParam("password")String password){
        return workerService.workerLogin(name, password);
    }

    @RequestMapping(value = "wrk/info/{wid}",method = RequestMethod.GET)
    public WorkerViewEntity showWrkInfo(@PathVariable("wid")int wid){
        return workerService.getWorkerInfo(wid);
    }

    @RequestMapping(value = "wrk/createdish/{wid}",method = RequestMethod.PUT)
    public int createDish(@RequestParam("dname")String dname,@RequestParam("dprice")double dprice,@PathVariable("wid")int wid) throws Exception {
        return workerService.createDish(wid,dname,dprice);
    }

    @RequestMapping(value = "wrk/ordernotice/{wid}",method = RequestMethod.GET)
    public List<OrderUpdNoticeEntity> getOrderNotice(@PathVariable("wid")int wid){
        return workerService.getUnreadOrderNotice(wid);
    }

    @RequestMapping(value = "wrk/readorder/{wid}",method = RequestMethod.PUT)
    public int readOrderNotice(@PathVariable("wid")int wid){
        return workerService.readOrderNotice(wid);
    }

    @RequestMapping(value = "wrk/updatedish/{ava}/{did}",method = RequestMethod.PUT)
    public int updateDishStatus(@PathVariable("ava")int ava,@PathVariable("did")int did){
        return workerService.updateDishStatus(ava, did);
    }

    @RequestMapping(value = "wrk/deletedish/{did}",method = RequestMethod.PUT)
    public int deleteDish(@PathVariable("did")int did){
        return workerService.deleteDish(did);
    }

    @RequestMapping(value = "wrk/orders/{wid}",method = RequestMethod.GET)
    public List<OrdersEntity> getAllOrders(@PathVariable("wid")int wid){
        return workerService.getAllOrders(wid);
    }

    @RequestMapping(value = "wrk/orderinfo/{oid}/{wid}",method = RequestMethod.GET)
    public List<Object> showOrderInfo(@PathVariable("oid")int oid,@PathVariable("wid")int wid){
        return workerService.getOrderInfo(oid, wid);
    }

    @RequestMapping(value = "wrk/takeorder/{oid}",method = RequestMethod.PUT)
    public int takeOrder(@PathVariable("oid")int oid) throws Exception {
        return workerService.takeOrder(oid);
    }
}
