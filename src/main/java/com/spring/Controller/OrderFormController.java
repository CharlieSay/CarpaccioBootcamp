package com.spring.Controller;

import com.spring.Business.OrderList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class OrderFormController {

    private OrderList orderList = new OrderList();

    @RequestMapping(path = "/orderform", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        return "OrderForm";
    }

    @RequestMapping(value = "/orderform" , method = RequestMethod.POST)
    public ResponseEntity login(@RequestParam("firstName") String firstName,
                                @RequestParam("secondName") String secondName,
                                @RequestParam("emailAddress") String emailAddress,
                                @RequestParam("phoneNumber") String phoneNumber,
                                @RequestParam("goldQuantity") String goldQuantity,
                                @RequestParam("silverQuantity") String silverQuantity,
                                @RequestParam("bronzeQuantity") String bronzeQuantity) {
        if(orderList.createNewOrder(firstName, secondName, emailAddress,
                phoneNumber,goldQuantity,silverQuantity,bronzeQuantity, orderList))
            return ResponseEntity.ok(HttpStatus.OK);
        return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
    }

}
