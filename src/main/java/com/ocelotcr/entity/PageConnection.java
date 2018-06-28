package com.ocelotcr.entity;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;

public class PageConnection {

    private static final Logger logger = Logger.getLogger("com.ocelotcr.orderform");
    private String address;
    private LocalDateTime connectionTime;
    private String pageVisit;

    public PageConnection(String address, LocalDateTime connectionTime, String pageVisit) {
        this.address = address;
        this.connectionTime = connectionTime;
        this.pageVisit = pageVisit;
            logger.debug("connector ip ".concat(address));
        logger.debug("pageVisted  ".concat(pageVisit));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(pageVisit)
                .append(" || Address : ")
                .append(address)
                .append(" || PageConnection Time : ")
                .append(connectionTime.toString());
        return sb.toString();
    }

    public String getAddress() {
        return address;
    }

    public LocalDateTime getConnectionTime() {
        return connectionTime;
    }
}
