package com.spring.Controller;

import com.spring.Entity.Order;
import com.spring.Business.OrderControllerClass;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StatusController {

    @RequestMapping(path = "/status", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity returner(){
        List<Order> orderList = OrderControllerClass.getOrderList();
        if (orderList.isEmpty()) return ResponseEntity.ok("{\"response\":{\"title\": \"bad\"}}");
        String str = "{";
        for (Order order : orderList){
            str += "\""+order.getOrderNumber()+"\": {";
            str += "\"firstName\": \""+order.getFirstName()+"\",";
            str += "\"secondName\": \""+order.getSecondName()+"\",";
            str += "\"emailAddress\": \""+order.getEmailAddress()+"\",";
            str += "\"phoneNumber\": \""+order.getPhoneNumber()+"\",";
            str += "\"goldQuantity\": \""+order.getGoldQuantity()+"\",";
            str += "\"silverQuantity\": \""+order.getSilverQuantity()+"\",";
            str += "\"bronzeQuantity\": \""+order.getBronzeQuantity()+"\" ";
            str += "},";
        }
        str = str.substring(    0,str.length()-1);
        str += "}";
        return ResponseEntity.ok(str);
    }

}
