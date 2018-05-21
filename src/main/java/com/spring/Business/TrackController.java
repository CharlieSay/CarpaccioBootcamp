package com.spring.Business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class TrackController {

    @RequestMapping(path = "/trackprogress", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        return "TrackProgress";
    }

}
