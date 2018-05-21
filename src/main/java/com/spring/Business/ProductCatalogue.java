package com.spring.Business;

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
        model.put("goldDetails", getPackageContent(PackageLevel.GOLD));
        model.put("silverDetails", getPackageContent(PackageLevel.SILVER));
        model.put("bronzeDetails", getPackageContent(PackageLevel.BRONZE));
        return "ProductCatalogue";
    }

    private String getPackageContent(PackageLevel packageLevel){
        switch(packageLevel){
            case GOLD:
                return "2 - 10x8 Prints, 4 - 5x7 Prints, 4 - Wallet Prints, 4 - Keyring Prints, " +
                        "2 - Bookmarks, 1 - Sheet of sticker prints, 2 - Fridge Magnets";
            case SILVER:
                return "1 - 10x8 Print, 3 - 5x7 Prints, 4 - Wallet Prints, 4 - Keyring Prints";
            case BRONZE:
                return "3 - 5x7 Prints, 4 - Wallet Prints, 4 - Keyring Prints";
            default:
                return null;
        }
    }

    private int getPackageLevelPrice(PackageLevel packageLevel){
        switch(packageLevel){
            case GOLD:
                return 45;
            case SILVER:
                return 30;
            case BRONZE:
                return 23;
            default:
                return 0;
        }
    }
}

enum PackageLevel{
    GOLD,
    SILVER,
    BRONZE
}