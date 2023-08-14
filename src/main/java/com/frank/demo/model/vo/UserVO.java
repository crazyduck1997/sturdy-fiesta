package com.frank.demo.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author frank
 * @date 2022/11/22 22:17
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    private int id;

    private String name;

    private int age;
}
