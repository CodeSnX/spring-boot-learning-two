package com.soft1851.springboot.mybatis.service.impl;

import com.soft1851.springboot.mybatis.entity.TJurisdiction;
import com.soft1851.springboot.mybatis.mapper.TJurisdictionMapper;
import com.soft1851.springboot.mybatis.service.TJurisdictionService;
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
public class TJurisdictionServiceImpl extends ServiceImpl<TJurisdictionMapper, TJurisdiction> implements TJurisdictionService {
    private TJurisdictionMapper tJurisdictionMapper;
}
