package com.my.blog.website.service;

import com.github.pagehelper.PageInfo;
import com.my.blog.website.modal.Vo.ContentVo;
import com.my.blog.website.modal.Vo.ContentVoExample;

public interface IContentService {

//    /**
//     * 保存文章
//     * @param contentVo
//     */
//    void insertContent(ContentVo contentVo);

    /**
     * 发布文章
     * @param contents
     */
    void publish(ContentVo contents);

    /**
     * 查询文章返回多条数据
     * @param p
     * @param limit
     * @return
     */
    PageInfo<ContentVo> getContents(Integer p,Integer limit);

    /**
     * 根据id或slug获取文章
     * @param id
     * @return
     */
    ContentVo getContents(String id);

    /**
     * 根据主键更新
     * @param contentVo
     */
    void updateContentByCId(ContentVo contentVo);

    /**
     * 查询分类或标签下的文章归档
     * @param mid
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentVo> getArticles(Integer mid, int page, int limit);

    /**
     * 搜索、分页
     * @param keyword
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentVo> getArticles(String keyword,Integer page,Integer limit);

    /**
     *
     * @param contentVoExample
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentVo> getArticlesWithPage(ContentVoExample contentVoExample,Integer page,Integer limit);

    /**
     * 根据文章id删除
     * @param cid
     */
    void deleteByCid(Integer cid);

    /**
     * 编辑文章
     * @param contents
     */
    void updateArticle(ContentVo contents);

    /**
     * 更新原有文章的category
     * @param ordinal
     * @param newCategory
     */
    void updateCategory(String ordinal,String newCategory);
}
