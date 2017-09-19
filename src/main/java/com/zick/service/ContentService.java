package com.zick.service;

import com.zick.common.ServerResponse;
import com.zick.dao.ContentMapper;
import com.zick.model.Content;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.ListUtils;

import javax.annotation.Resource;
import java.util.List;

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

    public ServerResponse getAllContent(){
        List<Content> contentList = contentMapper.getAllContent();

        if(!ListUtils.isEmpty(contentList)){
            return ServerResponse.createBySuccess(contentList);
        }
        return ServerResponse.createByErrorMessage("当前无任何记录");
    }

    public ServerResponse support(int id){
        Content content = contentMapper.selectContentById(id);
        if(content != null){
            int support = content.getSupport() + 1;
            content.setSupport(support);
            int count = contentMapper.updateByPrimaryKeySelective(content);
            if(count <=0){
                return ServerResponse.createByErrorMessage("点赞失败");
            }
            return ServerResponse.createBySuccess("点赞成功",support);
        }
        return ServerResponse.createByErrorMessage("点赞失败");
    }

    public ServerResponse degrade(int id){
        Content content = contentMapper.selectContentById(id);
        if(content != null){
            int degrade = content.getDegrade() + 1;
            content.setDegrade(degrade);
            int count = contentMapper.updateByPrimaryKeySelective(content);
            if(count <=0){
                return ServerResponse.createByErrorMessage("贬低失败");
            }
            return ServerResponse.createBySuccess("贬低成功",degrade);
        }
        return ServerResponse.createByErrorMessage("贬低失败");
    }

    public ServerResponse delete(int id){
        int count = contentMapper.deleteByPrimaryKey(id);
        if(count >0){
            return ServerResponse.createBySuccessMessage("删除成功");
        }
        return ServerResponse.createByErrorMessage("删除失败");
    }
}
