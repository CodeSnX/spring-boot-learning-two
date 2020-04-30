package com.soft1851.springboot.mybatis.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xgp
 * @since 2020-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TJurisdiction implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String jId;

    /**
     * 父id
     */
    private Integer parentId;

    /**
     * 路由名称
     */
    private String jName;

    /**
     * 路由层级
     */
    private Integer jType;

    /**
     * 图片
     */
    private String jIcon;

    /**
     * 路由
     */
    private String jPath;


}
