package com.jimersylee.shiro.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jimersylee.shiro.core.entity.SysMenuEntity;

import java.util.List;

/**
 * @Description 权限业务接口
 * @Author Jimersy Lee
 * @CreateTime 2019/6/14 15:57
 */
public interface SysMenuService extends IService<SysMenuEntity> {
    
    
    /**
     * 根据角色查询用户权限
     * @Author Jimersy Lee
     * @CreateTime 2019/6/19 10:14
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenuEntity> selectSysMenuByRoleId(Long roleId);

}

