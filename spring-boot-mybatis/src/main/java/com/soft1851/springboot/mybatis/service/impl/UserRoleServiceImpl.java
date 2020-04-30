package com.soft1851.springboot.mybatis.service.impl;

import com.soft1851.springboot.mybatis.entity.UserRole;
import com.soft1851.springboot.mybatis.mapper.UserRoleMapper;
import com.soft1851.springboot.mybatis.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xgp
 * @since 2020-04-16
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
    private UserRoleMapper userRoleMapper;
}
