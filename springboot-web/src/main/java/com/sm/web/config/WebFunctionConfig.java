package com.sm.web.config;

import com.sm.web.bean.Person;
import com.sm.web.business.UserBizHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.function.*;

@Configuration
public class WebFunctionConfig {
    @Bean
    public RouterFunction<ServerResponse> userRouter(UserBizHandler userBizHandler){
        return RouterFunctions.route()
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL), userBizHandler::getUser)
                .GET("/users", userBizHandler::getUsers)
                //.GET("/users", RequestPredicates.accept(MediaType.ALL).and(RequestPredicates.param("a","ai")),userBizHandler::getUsers)
                .POST("/user", RequestPredicates.accept(MediaType.APPLICATION_JSON), userBizHandler::postUser)
                .DELETE("/user/{id}", userBizHandler::getUsers)
                .build();
    }
}
