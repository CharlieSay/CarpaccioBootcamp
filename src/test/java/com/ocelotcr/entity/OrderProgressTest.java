package com.ocelotcr.entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderProgressTest {

    @Test
    public void shouldReturn_CREATED_WithCreatedString(){
        assertEquals(OrderProgress.CREATED,OrderProgress.getProgress("CREATED"));
    }

    @Test
    public void shouldReturn_BILLED_WithBilledString(){
        assertEquals(OrderProgress.BILLED,OrderProgress.getProgress("BILLED"));
    }

    @Test
    public void shouldReturn_PRE_SHIPPING_WithPreShippingString(){
        assertEquals(OrderProgress.PRE_SHIPPING,OrderProgress.getProgress("PRE_SHIPPING"));
    }

    @Test
    public void shouldReturn_SHIPPED_WithShippedString(){
        assertEquals(OrderProgress.SHIPPED,OrderProgress.getProgress("SHIPPED"));
    }

    @Test
    public void shouldReturn_RECIEVED_WithRecievedString(){
        assertEquals(OrderProgress.RECEIVED,OrderProgress.getProgress("RECEIVED"));
    }

    @Test
    public void shouldReturn_null_WithInvalidString(){
        assertEquals(null,OrderProgress.getProgress("foobar"));
    }

    @Test
    public void shouldReturn_ValidEnum_WithRandomCaseLetters(){
        assertEquals(OrderProgress.CREATED,OrderProgress.getProgress("cReAtEd"));
    }

}