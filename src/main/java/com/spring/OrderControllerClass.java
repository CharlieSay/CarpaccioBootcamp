package com.spring;

import java.util.ArrayList;
import java.util.List;

public class OrderControllerClass {

   public static List<Order> orderList = new ArrayList<>();

    public void createNewOrder(String firstName, String secondName, String emailAddress, String phoneNumber){
        orderList.add(new Order(firstName,secondName,emailAddress,phoneNumber));
    }

}

class Order{
    private String firstName;
    private String secondName;
    private String emailAddress;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Order(String firstName, String secondName, String emailAddress, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
}