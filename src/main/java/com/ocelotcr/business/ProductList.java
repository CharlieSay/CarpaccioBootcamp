package com.ocelotcr.business;

import org.springframework.stereotype.Controller;

@Controller
public class ProductList {

    public int getPackageLevelPrice(PackageLevel packageLevel){
        if (!(packageLevel instanceof PackageLevel)) return 0;
        switch(packageLevel){
            case GOLD:
                return 45;
            case SILVER:
                return 30;
            case BRONZE:
                return 15;
            default:
                return 0;
        }
    }
}

