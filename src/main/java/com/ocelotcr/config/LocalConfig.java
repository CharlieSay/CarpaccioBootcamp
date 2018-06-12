package com.ocelotcr.config;

public class LocalConfig extends Config {

    public LocalConfig() {
        super.setPassword("busted29");
        super.setDatabaseUsername("root");
        super.setEnvironment("LOCAL");
        super.setDatabaseURL("jdbc:mysql://localhost:3306/CarpaccioOrders?useSSL=false");
    }

}
