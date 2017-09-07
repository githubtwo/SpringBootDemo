package com.zick.service;

import com.zick.common.ServerResponse;

import com.zick.dao.UserMapper;
import com.zick.model.User;
import com.zick.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

/**
 * Created by Administrator on 2017/8/2.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public ServerResponse<String> register(User user){
        if(StringUtils.isNotEmpty(user.getUsername())){
            int resulCount = userMapper.checkUsername(user.getUsername());
            if(resulCount > 0){
                return ServerResponse.createByErrorMessage("该用户已存在");
            }
            user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
            String uuid= UUID.randomUUID().toString();
            user.setId(uuid);
            int rowCount = userMapper.insert(user);
            if(rowCount > 0){
                return ServerResponse.createBySuccessMessage("注册成功");
            }
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createByErrorMessage("参数错误");
    }

    public ServerResponse<User> login(String username, String password){
        int resultCount = userMapper.checkUsername(username);
        if(resultCount == 0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        String md5Password = MD5Util.MD5EncodeUtf8(password);
        User user = userMapper.selectLogin(username,md5Password);

        if(user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }

    public ServerResponse<User> getUserInfo(String userId){
        if(userId!=null){
            User user = userMapper.selectByPrimaryKey(userId);
            return ServerResponse.createBySuccess(user);
        }
        return null;
    }

}
