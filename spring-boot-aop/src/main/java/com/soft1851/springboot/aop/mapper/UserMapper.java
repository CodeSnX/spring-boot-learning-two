package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface UserMapper {
    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    @Select("SELECT t1.*, t2.* " +
            "FROM user_role t3 " +
            "LEFT JOIN t_user t1 " +
            "ON t1.user_id = t3.user_id " +
            "LEFT JOIN t_role t2 " +
            "ON t2.role_id = t3.role_id " +
            "WHERE t3.user_id=#{userId}")
    Map<String,Object> getUserById(String userId);

    @Select("SELECT * FROM sys_user WHERE user_id=#{userId}")
    User signIn(String userId);

}
