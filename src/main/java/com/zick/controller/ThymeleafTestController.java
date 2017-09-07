package com.zick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafTestController {

    @RequestMapping("test")
    public String getHome(){

        return "test";
    }
}
