package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xgp
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleJurisdiction {
    private int id;
    private String roleId;
    private String jId;
}
