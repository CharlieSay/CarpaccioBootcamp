package com.spring;

import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController{

	private String message = "Hello World";

	@RequestMapping(path = "/", method = RequestMethod.PATCH)
    public String thing(){
	    return "welcome";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
        Random rand = new Random();
        int numberToPut = rand.nextInt(1000);
        model.put("message", this.message);
        model.put("numberRand", numberToPut);
        return "welcome";
    }

    @RequestMapping(path = "/{name}" , method = RequestMethod.POST)
    public ResponseEntity<String> getEntity(@PathVariable String name){
        if (name.equalsIgnoreCase("testAble")){
            return ResponseEntity.ok("Post Request");
        }else{
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }

}