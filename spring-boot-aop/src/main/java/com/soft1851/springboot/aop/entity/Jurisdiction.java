package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Jurisdiction {
    private String jId;
    private int parentId;
    private String jName;
    private int jType;
    private String jIcon;
    private String jPath;
}
