package com.ocelotcr.entity;

public enum OrderProgress {

    CREATED,
    BILLED,
    PRE_SHIPPING,
    SHIPPED,
    RECEIVED;

    public static OrderProgress getProgress(String progressLiteral){
        progressLiteral = progressLiteral.toUpperCase();
        switch(progressLiteral){
            case ("CREATED"):
                return CREATED;
            case ("BILLED"):
                return BILLED;
            case ("PRE_SHIPPING"):
                return PRE_SHIPPING;
            case ("SHIPPED"):
                return SHIPPED;
            case ("RECEIVED"):
                return RECEIVED;
            default:
                return null;
        }
    }
}

