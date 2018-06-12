package com.ocelotcr.controller;

import org.junit.Assert;
import org.junit.Test;

public class HomeControllerTest {

    @Test
    public void should_ReturnHomePage(){
        HomeController hs = new HomeController();

        Assert.assertEquals("HomePage",hs.welcome(null));
    }

}