package com.jimersylee.shiro.core.service.impl;

import com.jimersylee.shiro.core.dao.SysUserRoleDao;
import com.jimersylee.shiro.core.entity.SysUserRoleEntity;
import com.jimersylee.shiro.core.service.SysUserRoleService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description 用户与角色业务实现
 * @Author Jimersy Lee
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

}