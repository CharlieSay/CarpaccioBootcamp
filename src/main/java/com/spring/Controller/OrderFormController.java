package com.spring.Controller;

import com.spring.Business.OrderManage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class OrderFormController {

    private OrderManage orderManage = new OrderManage();

    @RequestMapping(path = "/orderform", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        return "OrderForm";
    }

    @RequestMapping(value = "/orderform" , method = RequestMethod.POST)
    public ResponseEntity createNewOrder(@RequestParam("firstName") String firstName,
                                         @RequestParam("secondName") String secondName,
                                         @RequestParam("emailAddress") String emailAddress,
                                         @RequestParam("phoneNumber") String phoneNumber,
                                         @RequestParam("goldQuantity") String goldQuantity,
                                         @RequestParam("silverQuantity") String silverQuantity,
                                         @RequestParam("bronzeQuantity") String bronzeQuantity) {
        try{
            orderManage.createNewOrder(firstName, secondName, emailAddress,
                    phoneNumber,Integer.parseInt(goldQuantity),Integer.parseInt(silverQuantity),Integer.parseInt(bronzeQuantity));
                return ResponseEntity.ok(HttpStatus.OK);
        }catch(Exception e){
            Logger.getGlobal().log(Level.WARNING, "Context : " + e.toString());
            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
        }
    }

}
