package com.soft1851.springboot.mybatis.service.impl;

import com.soft1851.springboot.mybatis.entity.TUser;
import com.soft1851.springboot.mybatis.mapper.TUserMapper;
import com.soft1851.springboot.mybatis.service.TUserService;
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
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {
    private TUserMapper tUserMapper;

}
