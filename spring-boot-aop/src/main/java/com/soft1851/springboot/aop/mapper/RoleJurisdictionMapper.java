package com.soft1851.springboot.aop.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface RoleJurisdictionMapper {
    /**
     * 根据角色id查询角色
     * @param roleId
     * @return
     */
    @Results({
            @Result(property = "jurisdiction", column = "j_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.JurisdictionMapper.getChildJurisdictionById")),
    })
    @Select("SELECT * FROM role_jurisdiction WHERE role_id=#{roleId}")
    List<Map<String, Object>> getRoleById(int roleId);
}
