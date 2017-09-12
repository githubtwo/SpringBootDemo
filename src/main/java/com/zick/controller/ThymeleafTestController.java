package com.zick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller//<!--不能用RestController-->
@RequestMapping("thymeleaf")
public class ThymeleafTestController {

    @RequestMapping("login")
    public String getHome(){

        return "login";
    }

    @GetMapping("git")
    public String getGit(){

        return "git";
    }
}
