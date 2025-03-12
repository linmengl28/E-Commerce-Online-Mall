package com.AmyLin.em.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 接口返回对象包装类
 *
 * @author: AmyLin
 * @date: 2024-09-30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 结果数据
     */
    private T data;

}
