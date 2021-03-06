package com.my.blog.website.service;

import com.my.blog.website.modal.Vo.UserVo;

public interface IUserService {

    /**
     * 保存用户数据
     * @param userVo    用户数据
     * @return          主键
     */
    Integer insertUser(UserVo userVo);

    /**
     * 通过uid查找对象
     * @param uid
     * @return
     */
    UserVo queryUserById(Integer uid);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    UserVo login(String username, String password);

    /**
     * 根据主键更新user对象
     * @param userVo
     */
    void updateByUid(UserVo userVo);
}
