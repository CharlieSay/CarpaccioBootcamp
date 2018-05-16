package com.spring;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController{

	private String message = "Hello World";

//	@RequestMapping(path = "/", method = RequestMethod.PATCH)
//    public String thing(){
//	    return "HomePage";
//    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
        return "HomePage";
    }

//    @RequestMapping(path = "/{name}" , method = RequestMethod.POST)
//    public ResponseEntity<String> getEntity(@PathVariable String name){
//        return ResponseEntity.ok(name);
//    }

}