package com.sm.robotstarter.annotation;

import com.sm.robotstarter.RobotAutoConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(RobotAutoConfig.class)
public @interface EnableRobot {
}
