package com.ocelotcr.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class StatusControllerTest {

    @Test
    public void standard_StatusController(){
        StatusController statusController = new StatusController();
        Assert.assertEquals("TrackProgress",statusController.welcome(new HashMap<>()));
    }

    @Test
    public void should_ReturnOKEntity_WhenValidOrderDetails(){
        StatusController statusController = new StatusController();
        Assert.assertEquals(ResponseEntity.ok("OK"),statusController.getOrderDetails("1"));
    }

}