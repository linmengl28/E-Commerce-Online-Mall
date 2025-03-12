package com.AmyLin.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AmyLin.em.entity.OrderGoods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单-商品关联持久层 （mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface OrderGoodsMapper extends BaseMapper<OrderGoods> {

}
