package com.ocelotcr.config;

import org.junit.Test;

import static org.junit.Assert.*;


public class ConfigTest {

    Config config;

    @Test
    public void should_GetCredentialsForLocalConfig(){
        config = new LocalConfig();

        assertEquals("jdbc:mysql://localhost:3306/CarpaccioOrders?useSSL=false",config.getDatabaseURL());
        assertEquals("root",config.getDatabaseUsername());
        assertEquals("busted29",config.getPassword());
        assertEquals("LOCAL",config.getEnvironment());
    }

}