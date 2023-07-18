package com.sm.web.business;

import com.sm.web.bean.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.Arrays;
import java.util.List;

@Component
public class UserBizHandler {
    public ServerResponse getUser(ServerRequest request) throws Exception{
        Person person = new Person(1,"Tonny",24,"Man","Admin");
        return ServerResponse.ok().body(person);
    }

    public ServerResponse getUsers(ServerRequest request) {
        List<Person> list = Arrays.asList(
                new Person(1,null,21,"Male","admin"),
                new Person(2,"Tim",24,"Male","emp"),
                new Person(3,"Tam",25,"Female","hr"),
                new Person(4,"Tem",20,"Female","emp"),
                new Person(5,"Tum",24,"Female","emp")
        );
        return ServerResponse.ok().body(list);
    }

    public ServerResponse postUser(ServerRequest request) {
        Person person = new Person(1,"Morays",26,"Man","Admin");
        return ServerResponse.ok().body(person);
    }
}
