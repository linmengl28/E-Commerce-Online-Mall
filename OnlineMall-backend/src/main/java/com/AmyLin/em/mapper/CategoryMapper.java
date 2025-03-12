package com.AmyLin.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AmyLin.em.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分类 持久层（mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
