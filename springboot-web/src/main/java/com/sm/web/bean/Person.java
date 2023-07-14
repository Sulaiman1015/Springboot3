package com.sm.web.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private Integer id;
    private String name;
    private int age;
    private String sex;
}
