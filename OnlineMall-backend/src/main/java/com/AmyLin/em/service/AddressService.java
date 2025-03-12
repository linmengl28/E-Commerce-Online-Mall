package com.AmyLin.em.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.AmyLin.em.entity.Address;
import com.AmyLin.em.mapper.AddressMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 地址相关 服务层
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Service
public class AddressService extends ServiceImpl<AddressMapper, Address> {

    /**
     * 通过用户id查询
     * @param userId 用户id
     * @return 地址列表
     */
    public List<Address> selectById(Long userId) {
        return lambdaQuery()
                .eq(Address::getUserId, userId)
                .list();
    }

}
