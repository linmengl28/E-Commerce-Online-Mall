package com.AmyLin.em.utils;

import com.AmyLin.em.entity.User;

/**
 * 用户信息
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
public class UserHolder {

    private static final ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

    public static void saveUser(User user){
        userThreadLocal.set(user);
    }

    public static User getUser(){
        return userThreadLocal.get();
    }

    public static void removeUser(){
        userThreadLocal.remove();
    }

}
