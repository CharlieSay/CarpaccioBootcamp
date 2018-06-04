package com.spring.Entity;

import com.spring.Business.OrderList;

import java.util.Random;

public class Order{
    private String firstName;
    private String secondName;
    private String emailAddress;
    private String phoneNumber;
    private String goldQuantity;
    private String silverQuantity;
    private String bronzeQuantity;
    private String orderNumber;
    private OrderProgress orderProgress;

    public Order(String firstName, String secondName, String emailAddress, String phoneNumber, String goldQuantity, String silverQuantity, String bronzeQuantity, OrderList orderList) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.goldQuantity = goldQuantity;
        this.silverQuantity = silverQuantity;
        this.bronzeQuantity = bronzeQuantity;
        this.orderNumber = orderNumberGen(orderList);
        this.orderProgress = OrderProgress.CREATED;
    }

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

    public String getOrderNumber(){
        return orderNumber;
    }

    public OrderProgress getOrderProgress() {
        return orderProgress;
    }

    public void setOrderProgress(OrderProgress orderProgress) {
        this.orderProgress = orderProgress;
    }

    private String orderNumberGen(OrderList orderlist){
        Random rnd = new Random();
        Integer numberGenerated = (10000000 + rnd.nextInt(90000000));
        for (Order order : orderlist.getOrderList()){
            if (numberGenerated == Integer.parseInt(order.getOrderNumber()))
                numberGenerated = 10000000 + rnd.nextInt(90000000);
        }
        return numberGenerated.toString();
    }

}
