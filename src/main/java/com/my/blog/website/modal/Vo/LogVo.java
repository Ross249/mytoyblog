package com.my.blog.website.modal.Vo;

/**
 * 日志
 */
public class LogVo {
    // 日志主键
    private Integer id;

    // 产生的动作
    private String action;

    // 产生的数据
    private String data;

    // 发生人id
    private Integer authorId;

    // 日志产生的ip
    private String ip;

    // 日志创建时间
    private Integer created;

    public LogVo(Integer id, String action, String data, Integer authorId, String ip, Integer created) {
        this.id = id;
        this.action = action;
        this.data = data;
        this.authorId = authorId;
        this.ip = ip;
        this.created = created;
    }

    public LogVo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}