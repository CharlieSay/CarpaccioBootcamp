package com.spring.Business;

import com.spring.Entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderControllerClass {

    private static List<Order> orderList = new ArrayList<>();

    public static List<Order> getOrderList() {
        return orderList;
    }

    public static boolean createNewOrder(String firstName, String secondName, String emailAddress, String phoneNumber, String orderContents){
        try{
            orderList.add(new Order(firstName,secondName,emailAddress,phoneNumber,orderContents));
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}

