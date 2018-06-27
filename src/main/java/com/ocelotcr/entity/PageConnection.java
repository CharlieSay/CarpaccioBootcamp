package com.ocelotcr.entity;

import com.ocelotcr.Carpaccio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class PageConnection {

    private static final Logger logger = LoggerFactory.getLogger(Carpaccio.class);
    private String address;
    private LocalDateTime connectionTime;
    private String pageVisit;

    public PageConnection(String address, LocalDateTime connectionTime, String pageVisit) {
        this.address = address;
        this.connectionTime = connectionTime;
        this.pageVisit = pageVisit;
        logger.debug("connector ip {}", address);
        logger.debug("pageVisted  {}", pageVisit);
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