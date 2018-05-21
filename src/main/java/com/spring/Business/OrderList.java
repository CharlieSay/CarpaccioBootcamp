package com.spring.Business;

import com.spring.Entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

    private static List<Order> orderList = new ArrayList<>();

    public static List<Order> getOrderList() {
        return orderList;
    }

    public static boolean createNewOrder(String firstName, String secondName, String emailAddress, String phoneNumber,
                                         String goldQuantity, String silverQuantity, String bronzeQuantity){
        try{
            orderList.add(new Order(firstName,secondName,emailAddress,phoneNumber,goldQuantity,silverQuantity,bronzeQuantity));
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static Order getOrderFromList(String orderId){
        for (Order order : orderList){
            if (order.getOrderNumber().equalsIgnoreCase(orderId)){
                return order;
            }
        }
        return null;
    }

}

