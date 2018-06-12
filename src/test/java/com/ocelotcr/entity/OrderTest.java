package com.ocelotcr.entity;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

    @Test
    public void should_GenerateRandomOrderNumbers(){
        Order firstOrder = new Order(
                   "Charlie",
                "Say",
                "charlie.say@autotrader.co.uk",
                "07428111111",
                1,
                0,
                0,
                0);
        Order secondOrder = new Order(
                "Cody",
                "Bentley",
                "codyBentley@rentalcars.co.uk",
                "01618307000",
                0,
                2,
                1,
                1);

        Assert.assertFalse(firstOrder.getOrderNumber()==secondOrder.getOrderNumber());
    }

}