package com.my.blog.website.service;

import com.my.blog.website.modal.Vo.LogVo;

import java.util.List;

public interface ILogService {

    /**
     * 保存操作日志
     * @param logVo
     */
    void insertLog(LogVo logVo);

    /**
     * 保存
     * @param action
     * @param data
     * @param ip
     * @param authorId
     */
    void insertLog(String action, String data, String ip, Integer authorId);

    /**
     * 获取日志分页
     * @param page
     * @param limit
     * @return
     */
    List<LogVo> getLogs(int page,int limit);
}
