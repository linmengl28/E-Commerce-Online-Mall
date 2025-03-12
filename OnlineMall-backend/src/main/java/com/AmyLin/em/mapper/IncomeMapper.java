package com.AmyLin.em.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 营收统计持久层 （mapper）
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Mapper
public interface IncomeMapper {

    @MapKey("categoryId")
    List<Map<String, Object>> selectCategoryIncome();

    BigDecimal selectSumIncome();

    BigDecimal getDayIncome(@Param("thisDay")String thisDay,@Param("nextDay") String nextDay);
}
