package com.AmyLin.em.entity.form;

import lombok.Data;

/**
 * 用户登录表单
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Data
public class LoginForm {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
