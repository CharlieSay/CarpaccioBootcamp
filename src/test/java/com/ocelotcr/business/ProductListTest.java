package com.ocelotcr.business;

import org.junit.Assert;
import org.junit.Test;

public class ProductListTest {

    private ProductList productList;

    @Test
    public void should_GetRelevantPrices_WithValidEnums(){
        productList = new ProductList();
        Integer goldPrice = 45;
        Integer silverPrice = 30;
        Integer bronzePrice = 15;

        Integer resultGoldPrice;
        Integer resultSilverPrice;
        Integer resultBronzePrice;

        resultGoldPrice = productList.getPackageLevelPrice(PackageLevel.GOLD);
        resultSilverPrice = productList.getPackageLevelPrice(PackageLevel.SILVER);
        resultBronzePrice = productList.getPackageLevelPrice(PackageLevel.BRONZE);

        Assert.assertEquals(goldPrice,resultGoldPrice);
        Assert.assertEquals(silverPrice,resultSilverPrice);
        Assert.assertEquals(bronzePrice,resultBronzePrice);
    }

    @Test
    public void should_Return0If_WhenNoEnum(){
        productList = new ProductList();
        Integer zero = 0;
        Integer resultPrice;

        resultPrice = productList.getPackageLevelPrice(null);

        Assert.assertEquals(zero,resultPrice);
    }

}