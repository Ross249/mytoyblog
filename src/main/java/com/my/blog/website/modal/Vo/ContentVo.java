package com.my.blog.website.modal.Vo;

/**
 * 文章
 */
public class ContentVo {
    // post主键
    private Integer cid;

    // 文章标题
    private String title;

    // 文章缩略名
    private String slug;

    // 文章创建时间——GMT Unix时间戳
    private Integer created;

    // 文章修改时间——GMT Unix时间戳
    private Integer modified;

    // 文章作者id
    private Integer authorId;

    // 文章类别
    private String type;

    // 文章状态
    private String status;

    // 标签列表
    private String tags;

    // 分类列表
    private String categories;

    // 点击次数
    private Integer hits;

    // 文章的评论数
    private Integer commentsNum;

    // 是否允许评论
    private Boolean allowComment;

    // 是否允许ping
    private Boolean allowPing;

    // 允许出现在聚合中
    private Boolean allowFeed;

    // 内容文字
    private String content;

    public ContentVo(Integer cid, String title, String slug, Integer created, Integer modified, Integer authorId, String type, String status, String tags, String categories, Integer hits, Integer commentsNum, Boolean allowComment, Boolean allowPing, Boolean allowFeed) {
        this.cid = cid;
        this.title = title;
        this.slug = slug;
        this.created = created;
        this.modified = modified;
        this.authorId = authorId;
        this.type = type;
        this.status = status;
        this.tags = tags;
        this.categories = categories;
        this.hits = hits;
        this.commentsNum = commentsNum;
        this.allowComment = allowComment;
        this.allowPing = allowPing;
        this.allowFeed = allowFeed;
    }

    public ContentVo(Integer cid, String title, String slug, Integer created, Integer modified, Integer authorId, String type, String status, String tags, String categories, Integer hits, Integer commentsNum, Boolean allowComment, Boolean allowPing, Boolean allowFeed, String content) {
        this.cid = cid;
        this.title = title;
        this.slug = slug;
        this.created = created;
        this.modified = modified;
        this.authorId = authorId;
        this.type = type;
        this.status = status;
        this.tags = tags;
        this.categories = categories;
        this.hits = hits;
        this.commentsNum = commentsNum;
        this.allowComment = allowComment;
        this.allowPing = allowPing;
        this.allowFeed = allowFeed;
        this.content = content;
    }

    public ContentVo() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getModified() {
        return modified;
    }

    public void setModified(Integer modified) {
        this.modified = modified;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories == null ? null : categories.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getCommentsNum() {
        return commentsNum;
    }

    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }

    public Boolean getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(Boolean allowComment) {
        this.allowComment = allowComment;
    }

    public Boolean getAllowPing() {
        return allowPing;
    }

    public void setAllowPing(Boolean allowPing) {
        this.allowPing = allowPing;
    }

    public Boolean getAllowFeed() {
        return allowFeed;
    }

    public void setAllowFeed(Boolean allowFeed) {
        this.allowFeed = allowFeed;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}