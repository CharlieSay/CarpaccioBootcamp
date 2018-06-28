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
        Assert.assertEquals(ResponseEntity.ok("{\"1\":{\"firstName\":\"Charlie\"" +
                ",\"secondName\":\"Say\",\"phoneNumber\":\"07428690009\"" +
                ",\"emailAddress\":\"charlie.say@autotrader.co.uk\"" +
                ",\"goldQuantity\":\"0\",\"silverQuantity\":\"0\"" +
                ",\"bronzeQuantity\":\"0\"}}"),statusController.getOrderDetails("1"));
    }

}