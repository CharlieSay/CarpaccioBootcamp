package com.ocelotcr.controller;

import com.ocelotcr.business.OrderManage;
import com.ocelotcr.entity.Order;
import com.ocelotcr.utility.JSONBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class StatusController {

    @RequestMapping(path = "/status", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        Order orderRequest = new OrderManage().getOrderFromList("1");
        model.put("firstName",orderRequest.getFirstName());
        model.put("secondName",orderRequest.getSecondName());
        model.put("phoneNumber",orderRequest.getPhoneNumber());
        model.put("orderProgress",orderRequest.getOrderProgress().toString());
        model.put("emailAddress",orderRequest.getEmailAddress());
        return "TrackProgress";
    }

    @RequestMapping(path = "/status/{orderId}", method = RequestMethod.GET)
    public String getOrderSingular(@PathVariable(value = "orderId") String orderId, Map<String, Object> model) {
        Order orderRequest = new OrderManage().getOrderFromList(orderId);
        model.put("firstName",orderRequest.getFirstName());
        model.put("secondName",orderRequest.getSecondName());
        model.put("phoneNumber",orderRequest.getPhoneNumber());
        model.put("orderProgress",orderRequest.getOrderProgress().toString());
        model.put("emailAddress",orderRequest.getEmailAddress());
        return "TrackProgress";
    }

    @RequestMapping(value = "/status/json/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getOrderDetails(@PathVariable(value = "orderId") String orderId){
        Order orderRequest = new OrderManage().getOrderFromList(orderId);
        JSONBuilder jsonBuilder = new JSONBuilder()
                .addField(orderRequest.getOrderNumber())
                .addLine("firstName",orderRequest.getFirstName())
                .addLine("secondName",orderRequest.getSecondName())
                .addLine("phoneNumber",orderRequest.getPhoneNumber())
                .addLine("emailAddress",orderRequest.getEmailAddress())
                .addLine("goldQuantity",orderRequest.getGoldQuantity().toString())
                .addLine("silverQuantity",orderRequest.getSilverQuantity().toString())
                .addLine("bronzeQuantity",orderRequest.getBronzeQuantity().toString())
                .addLine("orderProgress",orderRequest.getOrderProgress().toString())
                .endField()
                .end();
        return ResponseEntity.ok(jsonBuilder.toString());
    }

    @RequestMapping(value = "/status/{orderId}/{categoryChange}", method = RequestMethod.PATCH)
    public ResponseEntity updateOrderDetails(@PathVariable(value = "orderId") String orderId,
                                             @PathVariable(value = "categoryChange") String categoryChange,
                                             @RequestParam(value = "orderProgress") String valueChange){
        return ResponseEntity.ok(orderId+" "+categoryChange+" "+valueChange);
    }
}
