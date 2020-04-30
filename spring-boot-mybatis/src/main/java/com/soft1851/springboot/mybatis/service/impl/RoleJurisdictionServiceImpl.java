package com.soft1851.springboot.mybatis.service.impl;

import com.soft1851.springboot.mybatis.entity.RoleJurisdiction;
import com.soft1851.springboot.mybatis.mapper.RoleJurisdictionMapper;
import com.soft1851.springboot.mybatis.service.RoleJurisdictionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xgp
 * @since 2020-04-16
 */
@Service
public class RoleJurisdictionServiceImpl extends ServiceImpl<RoleJurisdictionMapper, RoleJurisdiction> implements RoleJurisdictionService {
    @Resource
    private RoleJurisdictionMapper roleJurisdictionMapper;
}
