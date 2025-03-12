package com.AmyLin.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.AmyLin.em.entity.Carousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 轮播图 持久层（mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface CarouselMapper extends BaseMapper<Carousel> {

    List<Carousel> findAllCarousel();
}
