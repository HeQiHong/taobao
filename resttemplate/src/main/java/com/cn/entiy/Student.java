package com.cn.entiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @date 2019/9/2 0002 16:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;

    private String name;

    private int age;

}
