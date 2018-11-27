package com.ocelotcr.utility;

import com.ocelotcr.config.LocalConfig;
import com.ocelotcr.entity.Order;
import com.ocelotcr.entity.OrderProgress;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.mock;

public class DatabaseConnectionTest {
//
//    @Test
//    public void should_ReturnDefaultOrder(){
//        Integer orderNumber = 1;
//        String firstName = "Charlie";
//        String secondName = "Say";
//        String phoneNumber = "07428690009";
//        String emailAddress = "charlie.say@autotrader.co.uk";
//        Integer goldQuantity = 0;
//        Integer silverQuantity = 0;
//        Integer bronzeQuantity = 0;
//
//        DatabaseConnection databaseConnection = new DatabaseConnection(new LocalConfig());
//
//        Order resultingOrder = databaseConnection.getOrder(orderNumber);
//
//        assertEquals(firstName,resultingOrder.getFirstName());
//        assertEquals(secondName,resultingOrder.getSecondName());
//        assertEquals(phoneNumber,resultingOrder.getPhoneNumber());
//        assertEquals(emailAddress,resultingOrder.getEmailAddress());
//        assertEquals(goldQuantity,resultingOrder.getGoldQuantity());
//        assertEquals(silverQuantity,resultingOrder.getSilverQuantity());
//        assertEquals(bronzeQuantity,resultingOrder.getBronzeQuantity());
//        assertEquals(OrderProgress.CREATED,resultingOrder.getOrderProgress());
//    }
//
//    @Test
//    public void should_ReturnNoOrder_WhenOrderIDDoesntMatch(){
//        Integer orderNumber = 1234;
//        DatabaseConnection databaseConnection = new DatabaseConnection(new LocalConfig());
//
//        Order resultingOrder = databaseConnection.getOrder(orderNumber);
//
//        Assert.assertNull(resultingOrder);
//
//    }
//
//    @Test
//    public void should_InsertNewOrder_WhenRealOrder(){
//        String firstName = "Daniel";
//        String secondName = "Pepper";
//        String phoneNumber = "07428691234";
//        String emailAddress = "daniel.pepper@autotrader.co.uk";
//        Integer goldQuantity = 3;
//        Integer silverQuantity = 2;
//        Integer bronzeQuantity = 1;
//
//        DatabaseConnection databaseConnection = new DatabaseConnection(new LocalConfig());
//
//        Order order = new Order(firstName,secondName,phoneNumber,emailAddress,goldQuantity,silverQuantity,bronzeQuantity,databaseConnection.getNewOrderNumber());
//        assertTrue(databaseConnection.addOrder(order));
//    }
//
//    @Test(expected = NullPointerException.class)
//    public void should_ThrowSQLException_ReturningFalse(){
//        DatabaseConnection databaseConnection = mock(DatabaseConnection.class);
//        Order faultOrder = new Order("","","","",
//                null, null, null,null);
//
//        willThrow(new NullPointerException()).given(databaseConnection).addOrder(faultOrder);
//
//        databaseConnection.addOrder(faultOrder);
//    }
//
//    @Test
//    public void getOrderNumber(){
//        System.out.println("Order Number : " + new DatabaseConnection(new LocalConfig()).getNewOrderNumber());
//    }
}