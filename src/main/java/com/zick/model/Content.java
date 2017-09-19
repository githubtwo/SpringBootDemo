package com.zick.model;

import javax.persistence.Column;
import javax.persistence.Table;

public class Content {
    private Integer id;

    private String userId;

    private Integer support;

    private Integer degrade;

    private String title;

    private String content;

    public Content(Integer id, String userId,Integer support, Integer degrade, String title, String content ) {
        this.id = id;
        this.userId = userId;
        this.support = support;
        this.degrade = degrade;
        this.title = title;
        this.content = content;
    }

    public Content() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getDegrade() {
        return degrade;
    }

    public void setDegrade(Integer degrade) {
        this.degrade = degrade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}