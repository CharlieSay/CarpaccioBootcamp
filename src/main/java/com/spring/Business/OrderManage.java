package com.spring.Business;

import com.spring.Config.LocalConfig;
import com.spring.Entity.Order;
import com.spring.Utility.DatabaseConnection;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderManage {

    public boolean createNewOrder(String firstName, String secondName, String emailAddress, String phoneNumber,
                                         Integer goldQuantity, Integer silverQuantity, Integer bronzeQuantity){
        try{
            DatabaseConnection dbc = new DatabaseConnection(new LocalConfig());
            Order createdOrder = new Order(firstName, secondName, emailAddress, phoneNumber, goldQuantity,
                    silverQuantity, bronzeQuantity, dbc.getNewOrderNumber());
            dbc.addOrder(createdOrder);
            return true;
        }catch(Exception e){
            Logger.getGlobal().log(Level.WARNING, "Context : " + e.toString());
            return false;
        }
    }

    public Order getOrderFromList(String orderId){
        DatabaseConnection dbc = new DatabaseConnection(new LocalConfig());
        try{
            Integer orderIdInteger = Integer.parseInt(orderId);
            return dbc.getOrder(orderIdInteger);
        }catch(NumberFormatException e){
            Logger.getGlobal().log(Level.WARNING, "Context : " + e.toString());
            return null;
        }
    }

}

