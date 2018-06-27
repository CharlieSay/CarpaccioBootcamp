package com.ocelotcr.controller;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalogueControllerTest {

    private ProductCatalogueController productCatalogue = new ProductCatalogueController();

    @Test
    public void shouldSomething(){
        Map map = new HashMap<String, Object>();
        Assert.assertEquals("ProductCatalogue",productCatalogue.welcome(map));
    }

}