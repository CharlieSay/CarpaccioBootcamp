package com.spring.Utility;

import org.junit.Assert;
import org.junit.Test;

public class JSONBuilderTest {

    @Test
    public void Should_Return_PlainJSON_OneLine(){
        JSONBuilder jsonBuilder = new JSONBuilder();
        String shouldBe = "{\"orderNumber\":\"123456\"}";

        jsonBuilder.addLine("orderNumber", "123456").end();

        Assert.assertEquals(shouldBe,jsonBuilder.toString());
    }

    @Test
    public void Should_Return_PlainJSON_OneLine_InsideOneField(){
        JSONBuilder jsonBuilder = new JSONBuilder();
        String shouldBe = "{\"123456\":{\"firstName\":\"charlie\"}}";

        jsonBuilder.addField("123456")
                .addLine("firstName","charlie")
                .endField()
                .end();

        System.out.println(jsonBuilder.toString());
        Assert.assertEquals(shouldBe,jsonBuilder.toString());
    }
}