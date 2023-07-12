package com.sm.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    //Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/h")
    public String hello(){
        //logger.info("some information");
        log.trace("trace level");
        log.debug("modified to level debug");
        log.info("@Slf4j same with logger.info()");
        log.warn("level warn");
        log.error("level error");
        return "Hello";
    }
}
