package com.spring.Entity;

import com.spring.Business.OrderControllerClass;

import java.util.Random;

public class Order{
    private String firstName;
    private String secondName;
    private String emailAddress;
    private String phoneNumber;
    private String goldQuantity;
    private String silverQuantity;
    private String bronzeQuantity;
    private Integer orderNumber;

    public String getSilverQuantity() {
        return silverQuantity;
    }

    public String getGoldQuantity() {
        return goldQuantity;
    }

    public String getBronzeQuantity() {
        return bronzeQuantity;
    }

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

    public Integer getOrderNumber(){
        return orderNumber;
    }

    private Integer orderNumberGen(){
        Random rnd = new Random();
        Integer numberGenerated = (10000000 + rnd.nextInt(90000000));
        for (Order order : OrderControllerClass.getOrderList()){
            if (numberGenerated == order.getOrderNumber())
                numberGenerated = 10000000 + rnd.nextInt(90000000);
        }
        return numberGenerated;
    }

    public Order(String firstName, String secondName, String emailAddress, String phoneNumber, String goldQuantity, String silverQuantity, String bronzeQuantity) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.goldQuantity = goldQuantity;
        this.silverQuantity = silverQuantity;
        this.bronzeQuantity = bronzeQuantity;
        this.orderNumber = orderNumberGen();
    }

}
