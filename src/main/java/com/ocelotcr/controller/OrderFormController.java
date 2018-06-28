package com.ocelotcr.controller;

import com.ocelotcr.business.OrderManage;
import com.ocelotcr.utility.JSONBuilder;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class OrderFormController {

    private static final Logger logger = Logger.getLogger("com.ocelotcr.orderform");
    private OrderManage orderManage = new OrderManage();

    @RequestMapping(path = "/orderform", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        return "OrderForm";
    }

    @RequestMapping(value = "/orderform" , method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createNewOrder(@RequestParam("firstName") String firstName,
                                         @RequestParam("secondName") String secondName,
                                         @RequestParam("emailAddress") String emailAddress,
                                         @RequestParam("phoneNumber") String phoneNumber,
                                         @RequestParam("goldQuantity") String goldQuantity,
                                         @RequestParam("silverQuantity") String silverQuantity,
                                         @RequestParam("bronzeQuantity") String bronzeQuantity) {
        try{
            Integer orderNumber = orderManage.createNewOrder(firstName, secondName, emailAddress,
                    phoneNumber,Integer.parseInt(goldQuantity),Integer.parseInt(silverQuantity),Integer.parseInt(bronzeQuantity));
            logger.info("Order Created : ".concat(orderNumber.toString()));
            JSONBuilder jsonBuilder = new JSONBuilder().addLine("orderNumber",orderNumber.toString()).end();
                return ResponseEntity.ok(jsonBuilder.toString());
        }catch(Exception e){
            logger.error("Context : " + e.toString());
            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
        }
    }

}
