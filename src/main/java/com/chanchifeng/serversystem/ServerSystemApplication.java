package com.chanchifeng.serversystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.chanchifeng.serversystem.controller")
public class ServerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerSystemApplication.class, args);
    }

}
