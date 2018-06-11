package com.spring.Business;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderManageTest {

    OrderManage orderManage;

    @Before
    public void setUp(){
        orderManage = new OrderManage();
    }

    @Test
    public void should_CreateOrder_ThenReturnTrue(){
        assertTrue(orderManage.createNewOrder("Ron","Phillips","0161",
                "ronPhil@phillips.com", 1,2,3));
    }

    @Test(expected = Exception.class)
    public void should_NotCreateOrder_ThenReturnFalse(){
        OrderManage orderMock = mock(OrderManage.class);

        when(orderMock.createNewOrder("Foo","Bar","Failure",
                "fail@fobarFail.com", 9,9,9)).thenThrow(new Exception());

        orderMock.createNewOrder("Foo","Bar","Failure",
                "fail@fobarFail.com", 9,9,9);
    }

    @Test
    public void should_ThrowNumberFormatException_WhenOrderIDNotValid(){
        OrderManage orderManage = new OrderManage();
        assertNull(orderManage.getOrderFromList("foobar"));
    }
    @Test
    public void should_ReturnAnOrder_WithValidOrder(){
        OrderManage orderManage = new OrderManage();
        assertNotNull(orderManage.getOrderFromList("1"));
    }
}