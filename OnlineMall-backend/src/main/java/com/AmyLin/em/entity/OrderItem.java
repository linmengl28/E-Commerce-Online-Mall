package com.AmyLin.em.entity;

import lombok.Data;

/**
 * 用来接收前台下订单时，传来的‘goods'参数
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Data
public class OrderItem {

    /*
     *商品id
     */
    private Long id;

    /*
     *商品规格
     */
    private String standard;

    /*
     *数量
     */
    private Integer num;

}
