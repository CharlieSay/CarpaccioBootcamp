package com.ocelotcr.controller;

import com.ocelotcr.business.PackageLevel;
import com.ocelotcr.business.ProductList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class ProductCatalogueController {

    @RequestMapping(path = "/productcatalogue", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        ProductList productList = new ProductList();
        model.put("goldPrice", productList.getPackageLevelPrice(PackageLevel.GOLD));
        model.put("silverPrice", productList.getPackageLevelPrice(PackageLevel.SILVER));
        model.put("bronzePrice", productList.getPackageLevelPrice(PackageLevel.BRONZE));
        return "ProductCatalogue";
    }

}
