package com.spring.Entity;

import com.spring.Business.OrderManage;

import java.util.Random;

public class Order{
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String emailAddress;
    private Integer goldQuantity;
    private Integer silverQuantity;
    private Integer bronzeQuantity;
    private OrderProgress orderProgress;
    private String orderNumber;

    public Order(String firstName, String secondName, String phoneNumber, String emailAddress, Integer goldQuantity, Integer silverQuantity, Integer bronzeQuantity, Integer previousOrderNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.goldQuantity = goldQuantity;
        this.silverQuantity = silverQuantity;
        this.bronzeQuantity = bronzeQuantity;
        this.orderNumber = orderNumberGen(previousOrderNumber);
        this.orderProgress = OrderProgress.CREATED;
    }

    public Integer getSilverQuantity() {
        return silverQuantity;
    }

    public Integer getGoldQuantity() {
        return goldQuantity;
    }

    public Integer getBronzeQuantity() {
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

    public String getOrderNumber(){
        return orderNumber;
    }

    public OrderProgress getOrderProgress() {
        return orderProgress;
    }

    public void setOrderProgress(OrderProgress orderProgress) {
        this.orderProgress = orderProgress;
    }

    private String orderNumberGen(Integer orderNumber){
        return orderNumber.toString();
    }

}
