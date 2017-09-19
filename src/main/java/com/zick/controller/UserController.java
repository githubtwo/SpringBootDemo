package com.zick.controller;

import com.zick.common.Const;
import com.zick.common.ServerResponse;
import com.zick.model.User;
import com.zick.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/login")
    public ServerResponse login(HttpServletResponse response, HttpSession session, String username, String password){
        response.setHeader("Access-Control-Allow-Origin", "*");
        logger.error("error");
        session.setMaxInactiveInterval(86400 * 30);
        ServerResponse<User> serverResponse = userService.login(username,password);
        if(serverResponse.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,serverResponse.getData());
        }
        return serverResponse;
    }

    @GetMapping("register")
    public ServerResponse register(User user,HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.register(user);
    }
}
