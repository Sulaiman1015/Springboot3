package com.sm.springbootcore;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //SPI
public class SpringbootCoreApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootCoreApplication.class, args);
        SpringApplication application = new SpringApplication(SpringbootCoreApplication.class);
        application.run(args);
    }

    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> System.out.println("===ApplicationRunner===");
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> System.out.println("===CommandLineRunner===");
    }

}
