package com.ocelotcr.config;

public abstract class Config {

    private String databasePassword;
    private String databaseUsername;
    private String environment;
    private String databaseURL;

    public void setDatabaseURL(String databaseURL) {
        this.databaseURL = databaseURL;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public String getPassword() {
        return databasePassword;
    }

    public void setPassword(String password) {
        this.databasePassword = password;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

}
