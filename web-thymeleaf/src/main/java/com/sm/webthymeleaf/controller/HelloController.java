package com.sm.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.sm.web.bean.Person;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    // this ** only place in the end part
    @GetMapping("/a*/b?/{p:[a-f]+}/**")
    public String hello(HttpServletRequest request, @PathVariable("p") String path){
        log.info("path p1 :{}", path);
        return request.getRequestURI();
    }

    //return json data by default using jackson in springboot
    //jackson support too xml, for return xml, use dependency jackson-dateformat-xml
    @GetMapping("/person")
    public Person person() throws JsonProcessingException {
        return new Person(1, "tim", 23, "man");

    }
}
