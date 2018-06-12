package com.ocelotcr.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class ProductCatalogue {

    @RequestMapping(path = "/productcatalogue", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        model.put("goldPrice", getPackageLevelPrice(PackageLevel.GOLD));
        model.put("silverPrice", getPackageLevelPrice(PackageLevel.SILVER));
        model.put("bronzePrice", getPackageLevelPrice(PackageLevel.BRONZE));
        return "ProductCatalogue";
    }

    private int getPackageLevelPrice(PackageLevel packageLevel){
        switch(packageLevel){
            case GOLD:
                return 45;
            case SILVER:
                return 30;
            case BRONZE:
                return 23;
        }
        return 0;
    }
}

enum PackageLevel{
    GOLD,
    SILVER,
    BRONZE
}