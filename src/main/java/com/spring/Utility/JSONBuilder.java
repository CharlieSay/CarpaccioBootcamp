package com.spring.Utility;

public class JSONBuilder {

    private static final String QUOTES = "\"";
    private static final String OPENER = ":{";

    private StringBuilder stringReturn = new StringBuilder();

    public JSONBuilder() {
        stringReturn.append("{");
    }

    public JSONBuilder addLine(String field, String value){
        stringReturn.append(QUOTES+ field + QUOTES + ":" + QUOTES + value+QUOTES+",");
        return this;
    }

    public JSONBuilder addField(String field){
        stringReturn.append(QUOTES + field + QUOTES + OPENER);
        return this;
    }

    public JSONBuilder endField(){
        stringReturn.deleteCharAt(stringReturn.length()-1);
        stringReturn.append("}");
        return this;
    }

    public JSONBuilder end(){
        if (stringReturn.charAt(stringReturn.length()-1) == ','){
            stringReturn.deleteCharAt(stringReturn.length()-1);
        }
        stringReturn.append("}");
        return this;
    }

    @Override
    public String toString() {
        return stringReturn.toString();
    }

}
