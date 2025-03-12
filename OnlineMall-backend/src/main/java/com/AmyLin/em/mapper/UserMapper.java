package com.AmyLin.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AmyLin.em.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户持久层 （mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
