package com.soft1851.springboot.mybatis.service.impl;

import com.soft1851.springboot.mybatis.entity.TRole;
import com.soft1851.springboot.mybatis.mapper.TRoleMapper;
import com.soft1851.springboot.mybatis.service.TRoleService;
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
public class TRoleServiceImpl extends ServiceImpl<TRoleMapper, TRole> implements TRoleService {
    private TRoleMapper tRoleMapper;

}
