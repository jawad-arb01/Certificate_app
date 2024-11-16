package com.arbahi.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello from Azure !! , my name is ilyasse arbahi !";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }
}
