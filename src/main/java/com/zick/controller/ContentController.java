package com.zick.controller;

import com.zick.common.Const;
import com.zick.common.ServerResponse;
import com.zick.model.Content;
import com.zick.model.User;
import com.zick.service.ContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class ContentController {

    @Resource
    private ContentService contentService;

    @GetMapping("/announce")
    public ServerResponse insert(Content content, HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user != null){
            return contentService.insert(content);
        }
        return ServerResponse.createByErrorMessage("当前用户为空");
    }
}
