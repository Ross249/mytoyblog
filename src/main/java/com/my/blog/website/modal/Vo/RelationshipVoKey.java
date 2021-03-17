package com.my.blog.website.modal.Vo;

/**
 * 关系
 */
public class RelationshipVoKey {
    // 文章主键
    private Integer cid;

    // 项目主键
    private Integer mid;

    public RelationshipVoKey(Integer cid, Integer mid) {
        this.cid = cid;
        this.mid = mid;
    }

    public RelationshipVoKey() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}