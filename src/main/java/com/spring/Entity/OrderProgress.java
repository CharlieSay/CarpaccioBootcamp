package com.spring.Entity;

public enum OrderProgress {

    CREATED,
    BILLED,
    PRE_SHIPPING,
    SHIPPED,
    RECIEVED;

    public static OrderProgress getProgress(String progressLiteral){
        switch(progressLiteral){
            case ("CREATED"):
                return CREATED;
            case ("BILLED"):
                return BILLED;
            case ("PRE_SHIPPING"):
                return PRE_SHIPPING;
            case ("SHIPPED"):
                return SHIPPED;
            case ("RECIEVED"):
                return RECIEVED;
            default:
                return null;
        }
    }
}

