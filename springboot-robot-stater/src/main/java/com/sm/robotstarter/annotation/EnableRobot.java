package com.sm.springbootrobotstater.robot.annotation;

import com.sm.springbootrobotstater.robot.RobotAutoConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(RobotAutoConfig.class)
public @interface EnableRobot {
}
