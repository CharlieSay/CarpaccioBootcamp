package com.ocelotcr.config;

import com.ocelotcr.utility.FileReader;

public class LocalConfig extends Config {

    public LocalConfig() {
        super.setPassword(new FileReader("DB_CARPACCIO_P.txt").getLine(0));
        super.setDatabaseUsername("root");
        super.setEnvironment("LOCAL");
        super.setDatabaseURL("jdbc:mysql://localhost:3306/CarpaccioOrders?useSSL=false");
    }

}
