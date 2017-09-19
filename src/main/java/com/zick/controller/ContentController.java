package com.zick.controller;

import com.zick.common.Const;
import com.zick.common.ServerResponse;
import com.zick.model.Content;
import com.zick.model.User;
import com.zick.service.ContentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class ContentController {

    @Resource
    private ContentService contentService;

    @GetMapping("/release")
    public ServerResponse insert(Content content, HttpSession session, HttpServletResponse response){
        //response.setHeader("Access-Control-Allow-Origin", "*");
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user != null){
            return contentService.insert(content);
        }
        return ServerResponse.createByErrorMessage("当前用户为空");
    }

    @GetMapping("/getAllContent")
    public ServerResponse getAllContent(HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin", "*");
        return contentService.getAllContent();
    }

    @GetMapping("/support")
    public ServerResponse support(int id,HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin", "*");
        return contentService.support(id);
    }

    @GetMapping("/degrade")
    public ServerResponse degrade(int id,HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin", "*");
        return contentService.degrade(id);
    }

    @GetMapping("/delete")
    public ServerResponse delete(int id,HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin", "*");
        return contentService.delete(id);
    }
}
