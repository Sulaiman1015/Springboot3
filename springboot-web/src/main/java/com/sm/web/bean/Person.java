package com.sm.web.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@JacksonXmlRootElement
@NoArgsConstructor
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String role;
}
