package com.ocelotcr.entity;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class PageConnectionTest {

    @Test
    public void should_LogCorrectIp_WhenAPageIsHit(){
        LocalDateTime now = LocalDateTime.now();
        PageConnection connection = new PageConnection("192.168.0.1",now,"HomePage");
        String toStringShouldBe = "HomePage || Address : 192.168.0.1 || PageConnection Time : " + now.toString();

        Assert.assertEquals(toStringShouldBe,connection.toString());
    }

}