package com.springbootreedy.reddyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springbootreedy")
public class ReddyprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReddyprojectApplication.class, args);
    }
}
