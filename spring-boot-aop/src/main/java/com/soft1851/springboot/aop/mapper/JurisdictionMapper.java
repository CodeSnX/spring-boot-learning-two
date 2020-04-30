package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.Jurisdiction;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface JurisdictionMapper {
    /**
     * 根据资源id查询
     * @param jId
     * @return
     */
    @Select("SELECT * FROM t_jurisdiction WHERE j_id=#{jId}")
    Jurisdiction getJurisdictionById(String jId);

    /**
     * 根据资源id查询资源及子类资源
     * @param jId
     * @return
     */
    @Results({
            @Result(property = "j_id", column = "j_id"),
            @Result(property = "subList", column = "j_id",
                    many=@Many(select="com.soft1851.springboot.aop.mapper.JurisdictionMapper.getJurisdictionById")),
    })
    @Select("SELECT * FROM t_jurisdiction WHERE j_id=#{jId}")
    Map<String, Object> getChildJurisdictionById(String jId);

    /**
     * 获取页面资源及其所拥有的子类资源
     * @return
     */
    @Results({
            @Result(property = "j_id", column = "j_id"),
            @Result(property = "subList", column = "j_id",
                    many=@Many(select="com.soft1851.springboot.aop.mapper.JurisdictionMapper.getJurisdictionByParentId")),
    })
    @Select("SELECT * FROM t_Jurisdiction WHERE parent_id = 0")
    List<Map<String, Object>> getParentJurisdiction();

    /**
     * 根据父类id查询子类资源
     * @param parentId
     * @return
     */
    @Results({
            @Result(property = "j_id", column = "j_id"),
            @Result(property = "subList", column = "j_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.JurisdictionMapper.getJurisdictionByParentId")),
    })
    @Select("SELECT * FROM t_Jurisdiction WHERE parent_id=#{parentId}")
    List<Map<String, Object>> getJurisdictionByParentId(int parentId);
}
