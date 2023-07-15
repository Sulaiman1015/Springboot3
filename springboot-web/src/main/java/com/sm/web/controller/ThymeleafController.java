package com.sm.web.controller;

import com.sm.web.bean.Person;
import lombok.Getter;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/th")
    public String thymePage(Model model){
        model.addAttribute("msg","Thymeleaf");
        return "thyme";
    }

    @GetMapping("/p")
    public String getPerson(Model model){
        Person p = new Person();
        p.setId(1);
        p.setName("Cindy");
        p.setAge(32);
        p.setSex("F");
        model.addAttribute("p",p);
        model.addAttribute("msg","Thymeleaf");
        return "thyme";
    }

    @GetMapping("/list")
    public List<Person> getList(Model model){
        List<Person> list = Arrays.asList(
                new Person(1,"Tom",21,"Male","admin"),
                new Person(2,"Tim",24,"Male","emp"),
                new Person(3,"Tam",25,"Female","hr"),
                new Person(4,"Tem",20,"Female","emp")
        );
        model.addAttribute("persons",list);
        return list;
    }
}
