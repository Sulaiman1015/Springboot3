package com.sm.robotstarter;

import com.sm.robotstarter.controller.RobotController;
import com.sm.robotstarter.properties.RobotProperties;
import com.sm.robotstarter.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RobotController.class, RobotProperties.class, RobotService.class})
@Configuration
public class RobotAutoConfig {
}
