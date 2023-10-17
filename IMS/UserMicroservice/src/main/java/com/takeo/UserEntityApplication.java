package com.takeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserEntityApplication.class, args);
    }

}