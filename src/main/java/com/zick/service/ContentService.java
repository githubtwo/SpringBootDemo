package com.zick.service;

import com.zick.common.ServerResponse;
import com.zick.dao.ContentMapper;
import com.zick.model.Content;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContentService {

    @Resource
    private ContentMapper contentMapper;

    public ServerResponse insert(Content content){
        int insert = contentMapper.insert(content);
        if(insert >0){
            return ServerResponse.createBySuccessMessage("发布成功");
        }
        return ServerResponse.createByErrorMessage("发布失败");
    }
}
