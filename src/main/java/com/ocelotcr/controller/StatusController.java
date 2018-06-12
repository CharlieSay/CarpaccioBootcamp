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


/*    public static String getCurrentList(){
//        List<Order> orderList = OrderManage.getOrderList();
//        if (orderList.isEmpty()) return "";
//        JSONBuilder jsonBuilder = new JSONBuilder();
//        for (Order order : orderList){
//            jsonBuilder.addField(order.getOrderNumber())
//                    .addLine("firstName", order.getFirstName())
//                    .addLine("secondName", order.getSecondName())
//                    .addLine("emailAddress", order.getEmailAddress())
//                    .addLine("phoneNumber", order.getPhoneNumber())
//                    .addLine("goldQuantity", order.getGoldQuantity().toString())
//                    .addLine("silverQuantity", order.getSilverQuantity().toString())
//                    .addLine("bronzeQuantity", order.getBronzeQuantity().toString())
//                    .endField();
//        }
//        jsonBuilder.end();
//        return jsonBuilder.toString();
//    }
*/

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeOrderDetails(@PathVariable(value = "orderId") String orderId){
        Logger.getGlobal().log(Level.INFO, "Order Status : " + new OrderManage().getOrderFromList(orderId).getOrderProgress());
        Logger.getGlobal().log(Level.INFO, "ID : " + orderId);
        return ResponseEntity.ok("OK");

    }
}
