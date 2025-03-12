package com.AmyLin.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AmyLin.em.entity.Address;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户地址 持久层（mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {

}
