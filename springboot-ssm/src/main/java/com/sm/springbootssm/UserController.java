package com.sm.springbootssm;

import com.sm.springbootssm.bean.User;
import com.sm.springbootssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userMapper.getUserById(id);
    }
}
