package com.AmyLin.em.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.AmyLin.em.entity.Cart;
import com.AmyLin.em.mapper.CartMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 购物车 服务层
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Service
@RequiredArgsConstructor
public class CartService extends ServiceImpl<CartMapper, Cart> {

    private final CartMapper cartMapper;

    /**
     * 通过用户id查询购物车相关信息
     *
     * @param userId 用户id
     * @return 用户购物车信息
     */
    public List<Map<String, Object>> selectByUserId(Long userId) {
        return cartMapper.selectByUserId(userId);
    }
}
