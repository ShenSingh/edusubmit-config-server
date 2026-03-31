package com.edusubmit.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EdusubmitConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdusubmitConfigServerApplication.class, args);
    }
}
