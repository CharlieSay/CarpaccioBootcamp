package com.spring.Utility;

import com.spring.Entity.Order;
import com.spring.Entity.OrderProgress;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {

    @Test
    public void should_ReturnDefaultOrder(){
        Integer orderNumber = 1;
        String firstName = "Charlie";
        String secondName = "Say";
        String phoneNumber = "07428690009";
        String emailAddress = "charlie.say@autotrader.co.uk";
        Integer goldQuantity = 0;
        Integer silverQuantity = 0;
        Integer bronzeQuantity = 0;

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Order resultingOrder = databaseConnection.GetOrder(orderNumber);

        assertEquals(firstName,resultingOrder.getFirstName());
        assertEquals(secondName,resultingOrder.getSecondName());
        assertEquals(phoneNumber,resultingOrder.getPhoneNumber());
        assertEquals(emailAddress,resultingOrder.getEmailAddress());
        assertEquals(goldQuantity,resultingOrder.getGoldQuantity());
        assertEquals(silverQuantity,resultingOrder.getSilverQuantity());
        assertEquals(bronzeQuantity,resultingOrder.getBronzeQuantity());
        assertEquals(OrderProgress.CREATED,resultingOrder.getOrderProgress());
    }

    @Test
    public void should_ReturnNoOrder_WhenOrderIDDoesntMatch(){
        Integer orderNumber = 1234;
        DatabaseConnection databaseConnection = new DatabaseConnection();

        Order resultingOrder = databaseConnection.GetOrder(orderNumber);

        Assert.assertNull(resultingOrder);

    }

    @Test
    public void should_InsertNewOrder_WhenRealOrder(){
        Integer orderNumber = 2;
        String firstName = "Daniel";
        String secondName = "Pepper";
        String phoneNumber = "07428691234";
        String emailAddress = "daniel.pepper@autotrader.co.uk";
        Integer goldQuantity = 3;
        Integer silverQuantity = 2;
        Integer bronzeQuantity = 1;

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Order order = new Order(firstName,secondName,phoneNumber,emailAddress,goldQuantity,silverQuantity,bronzeQuantity,orderNumber);
        assertTrue(databaseConnection.AddOrder(order));
    }
}