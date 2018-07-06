package com.ocelotcr.controller;

import com.ocelotcr.utility.JSONBuilder;
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
        JSONBuilder jsonBuilder = new JSONBuilder()
                .addField("1")
                .addLine("firstName","Charlie")
                .addLine("secondName","Say")
                .addLine("phoneNumber","07428690009")
                .addLine("emailAddress","charlie.say@autotrader.co.uk")
                .addLine("goldQuantity","0")
                .addLine("silverQuantity","0")
                .addLine("bronzeQuantity","0")
                .addLine("orderProgress","CREATED")
                .endField()
                .end();
        Assert.assertEquals(ResponseEntity.ok(jsonBuilder.toString()),statusController.getOrderDetails("1"));
    }

}