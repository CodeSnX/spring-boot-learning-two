package com.soft1851.springboot.mybatis.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *
 * @author xgp
 * @since 2020-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RoleJurisdiction implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String roleId;

    private String jId;


}
