package com.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class OrderFormController {
    @RequestMapping(path = "/orderform", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        return "OrderForm";
    }

    @RequestMapping(value = "/orderform" , method = RequestMethod.POST)
    public ResponseEntity login(@RequestParam("firstName") String firstName,
                                @RequestParam("secondName") String secondName,
                                @RequestParam("emailAddress") String emailAddress,
                                @RequestParam("phoneNumber") String phoneNumber) {
        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(emailAddress);
        System.out.println(phoneNumber);
        return ResponseEntity.ok("OK OK OK OK ");
    }

}
