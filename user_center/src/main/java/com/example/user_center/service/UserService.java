package com.example.user_center.service;

import com.example.user_center.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;


/**
* @author htt
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-12-02 11:25:00
*/
public interface UserService extends IService<User> {
    /**
     * 用户登录状态值
     */
    String USER_LOGIN_STATE = "userLoginState";

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request 请求体
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafetyUser(User originUser);
}
