package com.sm.springbootcore.robot.service;

import com.sm.springbootcore.robot.properties.RobotProperties;
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
