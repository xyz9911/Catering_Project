package com.hit.catering_project.Controller;

import com.hit.catering_project.Entities.RiderViewEntity;
import com.hit.catering_project.Entities.StudentViewEntity;
import com.hit.catering_project.Service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RiderController {

    @Autowired
    private RiderService riderService;

    @RequestMapping(value = "rider/log",method = RequestMethod.GET)
    public String riderLogin(@RequestParam("name")String name, @RequestParam("password")String password){
        return riderService.riderLogin(name, password);
    }

    @RequestMapping(value = "rider/info/{rid}",method = RequestMethod.GET)
    public RiderViewEntity showRiderInfo(@PathVariable("rid")int rid){
        return riderService.getRiderInfo(rid);
    }

    @RequestMapping(value = "rider/orders",method = RequestMethod.GET)
    public List<Object> showTakableOrders(){
        return riderService.getTakableOrders();
    }

    @RequestMapping(value = "rider/takeorder/{rid}/{oid}",method = RequestMethod.PUT)
    public int takeOrder(@PathVariable("rid")int rid,@PathVariable("oid")int oid) throws Exception {
        return riderService.takeOrder(rid, oid);
    }
}
