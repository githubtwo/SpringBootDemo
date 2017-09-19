package com.zick.model;

import java.util.Date;

public class Evaluate {
    private Integer id;

    private Integer contentId;

    private String username;

    private Date createTime;

    public Evaluate(Integer id, Integer contentId, String username, Date createTime) {
        this.id = id;
        this.contentId = contentId;
        this.username = username;
        this.createTime = createTime;
    }

    public Evaluate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}