package com.zick.model;

public class Collect {
    private Integer id;

    private Integer contentId;

    private String userId;

    public Collect(Integer id, Integer contentId, String userId) {
        this.id = id;
        this.contentId = contentId;
        this.userId = userId;
    }

    public Collect() {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}