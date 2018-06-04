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
                "07428111111",
                "1",
                "0",
                "0",
                null);
        Order secondOrder = new Order(
                "Cody",
                "Bentley",
                "codyBentley@rentalcars.co.uk",
                "01618307000",
                "0",
                "2",
                "1",
                null);

        Assert.assertFalse(firstOrder.getOrderNumber()==secondOrder.getOrderNumber());
        Logger.getGlobal().log(Level.INFO, (firstOrder.getOrderNumber()+" // "+secondOrder.getOrderNumber()));
    }

}