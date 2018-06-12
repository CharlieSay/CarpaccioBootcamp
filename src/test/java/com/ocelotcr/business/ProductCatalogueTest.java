package com.ocelotcr.business;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalogueTest {

    ProductCatalogue productCatalogue = new ProductCatalogue();

    @Test
    public void shouldSomething(){
        Map map = new HashMap<String, Object>();
        Assert.assertEquals("ProductCatalogue",productCatalogue.welcome(map)    );
    }

}