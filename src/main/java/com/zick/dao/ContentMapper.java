package com.zick.dao;

import com.zick.model.Content;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKeyWithBLOBs(Content record);

    int updateByPrimaryKey(Content record);

    List<Content> getAllContent();

    Content selectContentById(@Param("id")Integer id);
}