package com.AmyLin.em.controller;

import com.AmyLin.em.common.R;
import com.AmyLin.em.utils.TokenUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色 控制层
 *
 * @author: AmyLin
 * @date: 2024-08-10
 */
@RestController
public class RoleController {

    /**
     * 查询当前用户角色
     *
     * @return 角色名
     */
    @PostMapping("/role")
    public R<String> getUserRole() {
        return R.success(TokenUtils.getCurrentUser().getRole());
    }

}
