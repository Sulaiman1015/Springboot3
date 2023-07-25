package com.sm.springbootrobotstater.robot;

import com.sm.springbootrobotstater.robot.controller.RobotController;
import com.sm.springbootrobotstater.robot.properties.RobotProperties;
import com.sm.springbootrobotstater.robot.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RobotController.class, RobotProperties.class, RobotService.class})
@Configuration
public class RobotAutoConfig {
}
