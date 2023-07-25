package com.sm.robotstarter.service;

import com.sm.robotstarter.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {
    @Autowired
    RobotProperties robotProperties;
    public String hello(){
        return "Hello, name: "+robotProperties.getName()+", age: "+robotProperties.getAge()+", mail: "+robotProperties.getMail()+"";
    }
}
