package com.AmyLin.em.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.AmyLin.em.entity.Category;
import com.AmyLin.em.entity.IconCategory;
import com.AmyLin.em.mapper.CategoryMapper;
import com.AmyLin.em.mapper.IconCategoryMapper;
import com.AmyLin.em.utils.InterfaceWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品分类 服务层
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@Service
@RequiredArgsConstructor
public class CategoryService extends ServiceImpl<CategoryMapper, Category> {

    private final IconCategoryMapper iconCategoryMapper;

    /**
     * 新增下级分类 + 上下级分类关联
     *
     * @param category 下级分类
     */
    public void add(Category category) {
        //保存商品分类
        save(category);

        //保存商品分类图标
        IconCategory iconCategory = new IconCategory();
        iconCategory.setCategoryId(category.getId());
        iconCategory.setIconId(category.getIconId());
        iconCategoryMapper.insert(iconCategory);
    }

    /**
     * 删除商品分类
     *
     * @param id id
     * @return 结果
     */
    public Map<String, Object> delete(Long id) {
        //删除关联
        iconCategoryMapper.delete(
                Wrappers.<IconCategory>lambdaQuery().eq(IconCategory::getCategoryId, id)
        );

        //删除下级分类
        removeById(id);
        return InterfaceWrapper.success();
    }
}
