package com.spring.Business;

import com.spring.Entity.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderManage {

    private static List<Order> orderList = new ArrayList<>();

    public static List<Order> getOrderList() {
        return orderList;
    }

    public boolean createNewOrder(String firstName, String secondName, String emailAddress, String phoneNumber,
                                         Integer goldQuantity, Integer silverQuantity, Integer bronzeQuantity){
        try{
            Order createdOrder = new Order(firstName, secondName, emailAddress, phoneNumber, goldQuantity, silverQuantity, bronzeQuantity, orderList.size());
            getOrderList().add(createdOrder);
            Logger.getGlobal().log(Level.INFO, createdOrder.getOrderNumber());
            return true;
        }catch(Exception e){
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

