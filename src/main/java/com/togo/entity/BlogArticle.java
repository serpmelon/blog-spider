package com.togo.entity;

import java.util.Date;

/**
 * @Author taiyn
 * @Description TODO
 * @Date 11:28 上午 2020/4/6
 **/
public class BlogArticle {

    private int id;
    private String article;
    private String platform;
    private int readNum;
    private int commentNum;
    private int thumbNum;
    private Date createDate;
    private Date lastModifyDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getReadNum() {
        return readNum;
    }

    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getThumbNum() {
        return thumbNum;
    }

    public void setThumbNum(int thumbNum) {
        this.thumbNum = thumbNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}
