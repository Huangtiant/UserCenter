package com.example.user_center.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author htz
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 8583485173011637822L;

    private String userAccount;

    private String userPassword;

}
