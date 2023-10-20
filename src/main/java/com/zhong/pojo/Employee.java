package com.zhong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：zhongjianyi
 * @description：TODO
 * @date ：2023-10-20 14:45
 */

//员工表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender; //0:女    1：男
    private Department department;
    private Data birth;

}
