package com.sm.web.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JacksonXmlRootElement
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public Person() {

    }
}
