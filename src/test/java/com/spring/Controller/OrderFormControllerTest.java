package com.spring.Controller;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

public class OrderFormControllerTest {

    OrderFormController orderFormController = new OrderFormController();

    @Test
    public void should_ReturnOK_WhenOrderIsValid(){
        ResponseEntity result = orderFormController.createNewOrder(
                "John","Doe","foo@bar.com","01618307000",
                "3","5","7");

        assertEquals(ResponseEntity.ok(HttpStatus.OK),result);
    }

    @Test
    public void should_ReturnOK_WhenOrderIsInvalid(){
        ResponseEntity result = orderFormController.createNewOrder(
                null,null,null,null,
                null,null,null);

        assertEquals(ResponseEntity.ok(HttpStatus.BAD_REQUEST),result);
    }

}