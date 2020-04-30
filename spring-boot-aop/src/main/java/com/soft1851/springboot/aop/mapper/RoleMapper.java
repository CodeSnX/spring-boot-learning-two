package com.soft1851.springboot.aop.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author xgp
 */
public interface RoleMapper {
    /**
     * 根据角色id查询角色
     * @param roleId
     * @return
     */
    @Select("SELECT * FROM t_role WHERE role_id=#{roleId}")
    Map<String, Object> getRoleById(int roleId);
}
