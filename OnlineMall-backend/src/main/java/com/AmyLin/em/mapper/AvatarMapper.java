package com.AmyLin.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AmyLin.em.entity.Avatar;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户头像 持久层（mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface AvatarMapper extends BaseMapper<Avatar> {

}
