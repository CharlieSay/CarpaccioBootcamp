package com.spring.Controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

public class StatusControllerTest {

    @Test
    public void standard_StatusController(){
        StatusController statusController = new StatusController();
        Assert.assertEquals("TrackProgress",statusController.welcome(null));
    }

    @Test
    public void should_ReturnOKEntity_WhenValidOrderDetails(){
        StatusController statusController = new StatusController();
        Assert.assertEquals(ResponseEntity.ok("OK"),statusController.changeOrderDetails("1"));
    }

}