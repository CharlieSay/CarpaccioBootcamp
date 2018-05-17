package com.spring.Entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderTest {

    @Test
    public void should_GenerateRandomOrderNumbers(){
        Order firstOrder = new Order(
                   "Charlie",
                "Say",
                "charlie.say@autotrader.co.uk",
                "07428111111");
        Order secondOrder = new Order(
                "Cody",
                "Bentley",
                "codyBentley@rentalcars.co.uk",
                "0161MannyonMap");

        Assert.assertFalse(firstOrder.getOrderNumber()==secondOrder.getOrderNumber());
        Logger.getGlobal().log(Level.INFO, (firstOrder.getOrderNumber()+" // "+secondOrder.getOrderNumber()));
    }

}