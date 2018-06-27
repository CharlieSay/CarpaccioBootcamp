package com.ocelotcr.controller;

import com.ocelotcr.business.OrderManage;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StatusController {

    @RequestMapping(path = "/order", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
       // model.put("allOrders", getCurrentList());
        return "TrackProgress";
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeOrderDetails(@PathVariable(value = "orderId") String orderId){
        Logger.getGlobal().log(Level.INFO, "Order Status : " + new OrderManage().getOrderFromList(orderId).getOrderProgress());
        Logger.getGlobal().log(Level.INFO, "Something went wrong: {0} ", orderId);
        return ResponseEntity.ok("OK");

    }
}
