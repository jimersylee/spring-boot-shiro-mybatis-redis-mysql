package com.jimersylee.shiro.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jimersylee.shiro.core.entity.SysUserEntity;

/**
 * @Description 系统用户业务接口
 * @Author Jimersy Lee
 * @CreateTime 2019/6/14 15:57
 */
public interface SysUserService extends IService<SysUserEntity> {

    /**
     * 根据用户名查询实体
     * @Author Jimersy Lee
     * @CreateTime 2019/6/14 16:30
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    SysUserEntity selectUserByName(String username);

}

