package com.zick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafTestController {

    @RequestMapping("test")
    public String getHome(){

        return "test";
    }
}
