package com.my.blog.website.service;

import com.my.blog.website.modal.Vo.RelationshipVoKey;

import java.util.List;

public interface IRelationshipService {

    /**
     * 按主键删除
     * @param cid
     * @param mid
     */
    void deleteById(Integer cid,Integer mid);

    /**
     * 按主键统计条数
     * @param cid
     * @param mid
     * @return
     */
    Long countById(Integer cid, Integer mid);

    /**
     * 保存对象
     * @param relationshipVoKey
     */
    void insertVo(RelationshipVoKey relationshipVoKey);

    /**
     * 按id搜索
     * @param cid
     * @param mid
     * @return
     */
    List<RelationshipVoKey> getRelationshipById(Integer cid, Integer mid);
}
