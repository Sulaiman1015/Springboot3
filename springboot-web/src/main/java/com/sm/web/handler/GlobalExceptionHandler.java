package com.sm.web.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
   // @ResponseBody
   // @ExceptionHandler(Exception.class)
    public String handleException(Exception e){
        return "oPPs, you get error "+e;
    }
}
