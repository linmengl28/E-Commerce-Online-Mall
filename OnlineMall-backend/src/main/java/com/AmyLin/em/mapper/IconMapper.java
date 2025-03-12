package com.AmyLin.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AmyLin.em.entity.Icon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 图标持久层（mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface IconMapper extends BaseMapper<Icon> {

    List<Icon> getIconCategoryMapList();
}
