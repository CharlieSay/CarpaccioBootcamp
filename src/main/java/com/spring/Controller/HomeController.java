package com.spring.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
        return "HomePage";
    }

}