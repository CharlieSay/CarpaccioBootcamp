package com.spring.Business;

import com.spring.Entity.Order;
import com.spring.Entity.OrderProgress;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderManageTest {

    OrderManage orderManage;

    @Before
    public void setUp(){
        orderManage = new OrderManage();
    }

    @Test
    public void should_CreateNewOrder_WhenProvidedValidOrder(){
        orderManage.createNewOrder(
                "Charlie",
                "Say",
                "charlie.say@example.com",
                "01618301234",
                1,
                2,
                3
        );

        Integer sizeOfList = OrderManage.getOrderList().size();

        assertTrue(sizeOfList.equals(1));
    }

    @Test
    public void should_CreateMultipleOrders_WhenProvidedValidOrder(){
        orderManage.createNewOrder(
                "Charlie",
                "Say",
                "charlie.say@example.com",
                "01618301234",
                1,
                2,
                3
        );
        orderManage.createNewOrder(
                "Charlie",
                "Say",
                "charlie.say@example.com",
                "01618301234",
                1,
                2,
                3
        );
        orderManage.createNewOrder(
                "Charlie",
                "Say",
                "charlie.say@example.com",
                "01618301234",
                1,
                2,
                3
        );

        Integer sizeOfList = OrderManage.getOrderList().size();

        assertTrue(sizeOfList.equals(3));
    }

    @Test
    public void Should_GetSpecificOrder_WhenProvidedOrderID(){
        String orderId = "1";
        String firstName = "Charlie";
        String secondName = "Say";
        String emailAddress = "charlie.say@example.com";
        String phoneNumber = "01618301234";
        Integer goldQuantity = 1;
        Integer silverQuantity = 2;
        Integer bronzeQuantity = 3;

        orderManage.createNewOrder(
                firstName,
                secondName,
                emailAddress,
                phoneNumber,
                goldQuantity,
                silverQuantity,
                bronzeQuantity
        );
        orderManage.createNewOrder(
                "Dave",
                "Doodie",
                "Dave.doodie@example.com",
                "01813812312",
                7,
                8,
                9
        );


        Order orderReturn = OrderManage.getOrderFromList("0");
        Assert.assertEquals(firstName, orderReturn.getFirstName());
        Assert.assertEquals(secondName, orderReturn.getSecondName());
        Assert.assertEquals(emailAddress, orderReturn.getEmailAddress());
        Assert.assertEquals(phoneNumber, orderReturn.getPhoneNumber());
        Assert.assertEquals(goldQuantity, orderReturn.getGoldQuantity());
        Assert.assertEquals(silverQuantity, orderReturn.getSilverQuantity());
        Assert.assertEquals(bronzeQuantity, orderReturn.getBronzeQuantity());
        Assert.assertEquals(OrderProgress.CREATED, orderReturn.getOrderProgress());
        Assert.assertEquals("0", orderReturn.getOrderNumber());
    }

    @After
    public void tearDown(){
        OrderManage.getOrderList().clear();
    }
}