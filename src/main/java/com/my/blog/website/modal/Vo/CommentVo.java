package com.my.blog.website.modal.Vo;

/**
 * 评论
 */
public class CommentVo {
    // 主键
    private Integer coid;

    // 与post表关联字段
    private Integer cid;

    // 评论生成时的GMT Unix时间戳
    private Integer created;

    // 评论作者
    private String author;

    // 评论所属用户id
    private Integer authorId;

    // 评论所属内容作者id
    private Integer ownerId;

    // 评论者邮箱
    private String mail;

    // 评论者网站
    private String url;

    // 评论者ip地址
    private String ip;

    // 评论者客户端
    private String agent;

    // 评论类型
    private String type;

    // 评论状态
    private String status;

    // 父级评论
    private Integer parent;

    // 评论内容
    private String content;

    public CommentVo(Integer coid, Integer cid, Integer created, String author, Integer authorId, Integer ownerId, String mail, String url, String ip, String agent, String type, String status, Integer parent) {
        this.coid = coid;
        this.cid = cid;
        this.created = created;
        this.author = author;
        this.authorId = authorId;
        this.ownerId = ownerId;
        this.mail = mail;
        this.url = url;
        this.ip = ip;
        this.agent = agent;
        this.type = type;
        this.status = status;
        this.parent = parent;
    }

    public CommentVo(Integer coid, Integer cid, Integer created, String author, Integer authorId, Integer ownerId, String mail, String url, String ip, String agent, String type, String status, Integer parent, String content) {
        this.coid = coid;
        this.cid = cid;
        this.created = created;
        this.author = author;
        this.authorId = authorId;
        this.ownerId = ownerId;
        this.mail = mail;
        this.url = url;
        this.ip = ip;
        this.agent = agent;
        this.type = type;
        this.status = status;
        this.parent = parent;
        this.content = content;
    }

    public CommentVo() {
        super();
    }

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}