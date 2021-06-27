package com.mtk.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoldPriceController {
    @RequestMapping("/price")
    public String getGoldPrice(){
        return "GoldPrice";
    }
}
