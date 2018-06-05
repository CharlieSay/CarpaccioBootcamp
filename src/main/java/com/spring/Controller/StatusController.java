package com.spring.Controller;

import com.spring.Business.OrderManage;
import com.spring.Entity.Order;
import com.spring.Utility.JSONBuilder;
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

        @RequestMapping(path = "/order", method = RequestMethod.GET)
        public String welcome(Map<String, Object> model) {
            model.put("allOrders", getCurrentList());
            return "TrackProgress";
        }


    public static String getCurrentList(){
        List<Order> orderList = OrderManage.getOrderList();
        if (orderList.isEmpty()) return "";
        JSONBuilder jsonBuilder = new JSONBuilder();
        for (Order order : orderList){
            jsonBuilder.addField(order.getOrderNumber())
                    .addLine("firstName", order.getFirstName())
                    .addLine("secondName", order.getSecondName())
                    .addLine("emailAddress", order.getEmailAddress())
                    .addLine("phoneNumber", order.getPhoneNumber())
                    .addLine("goldQuantity", order.getGoldQuantity())
                    .addLine("silverQuantity", order.getSilverQuantity())
                    .addLine("bronzeQuantity", order.getBronzeQuantity())
                    .endField();
        }
        jsonBuilder.end();
        return jsonBuilder.toString();
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeOrderDetails(@PathVariable(value = "orderId") String orderId) throws IOException {
//        if (!body.contains("orderStatus")) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        ObjectNode node = new ObjectMapper().readValue(body, ObjectNode.class);
        Logger.getGlobal().log(Level.INFO, "Order Status : " + OrderManage.getOrderFromList(orderId).getOrderProgress());
        Logger.getGlobal().log(Level.INFO, "ID : " + orderId);
        return ResponseEntity.ok("OK");

    }
}
