package com.example.user_center.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author htz
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 4412980317709921227L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
