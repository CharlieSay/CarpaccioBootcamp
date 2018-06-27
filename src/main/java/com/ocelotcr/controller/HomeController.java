package com.ocelotcr.controller;

import java.time.LocalDateTime;
import java.util.Map;

import com.ocelotcr.entity.Connection;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
        return "HomePage";
    }

    @RequestMapping(value = "/" , method = RequestMethod.POST)
    public ResponseEntity createNewOrder(@RequestParam("ipAddress") String ipAddress){
        new Connection(ipAddress,LocalDateTime.now(),"HomePage");
        return ResponseEntity.ok(HttpStatus.OK);
    }

}