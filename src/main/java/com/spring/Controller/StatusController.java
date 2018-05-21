package com.spring.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.spring.Business.OrderList;
import com.spring.Entity.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StatusController {

//    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
//    public ResponseEntity returner() {
//        String listJson = getCurrentList();
//        if (listJson.isEmpty()){return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();}
//        return ResponseEntity.ok(listJson);
//    }

    @RequestMapping(path = "/status", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        model.put("allOrders",getCurrentList());
        return "TrackProgress";
    }

    private String getCurrentList(){
        List<Order> orderList = OrderList.getOrderList();
        if (orderList.isEmpty()) return "";
        String str = "{";
        for (Order order : orderList) {
            str += "\"" + order.getOrderNumber() + "\": {";
            str += "\"firstName\": \"" + order.getFirstName() + "\",";
            str += "\"secondName\": \"" + order.getSecondName() + "\",";
            str += "\"emailAddress\": \"" + order.getEmailAddress() + "\",";
            str += "\"phoneNumber\": \"" + order.getPhoneNumber() + "\",";
            str += "\"goldQuantity\": \"" + order.getGoldQuantity() + "\",";
            str += "\"silverQuantity\": \"" + order.getSilverQuantity() + "\",";
            str += "\"bronzeQuantity\": \"" + order.getBronzeQuantity() + "\" ";
            str += "},";
        }
        str = str.substring(0, str.length() - 1);
        str += "}";
        return str;
    }


    @RequestMapping(value = "/{orderId}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeOrderDetails(@PathVariable(value = "orderId") String orderId, @RequestBody String body) throws IOException {
        if (!body.contains("orderStatus")) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        ObjectNode node = new ObjectMapper().readValue(body, ObjectNode.class);
        Logger.getGlobal().log(Level.INFO, "Order Status : " + node.get("orderStatus"));
        Logger.getGlobal().log(Level.INFO, "ID : " + orderId);
        return ResponseEntity.ok("OK");

    }
}
