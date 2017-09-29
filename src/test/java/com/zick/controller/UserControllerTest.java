package com.zick.controller;

import com.zick.common.ServerResponse;
import com.zick.model.User;
import com.zick.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class UserControllerTest {
    @Resource
    private MockMvc mockMvc;

    @Resource
    private UserService userService;
    @Test
    public void login() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/login"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("abc"));
    /*    User user = new User("zickt2","123456");

        Assert.assertEquals(0,userService.login(user.getUsername(),user.getPassword()).getStatus());*/
    }

    @Test
    public void register() throws Exception {

    }

    public void getAllUser() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user/getAllUser"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("abc"));

    }

}