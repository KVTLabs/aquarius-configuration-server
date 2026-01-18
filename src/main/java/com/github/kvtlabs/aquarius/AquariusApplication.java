package com.github.kvtlabs.aquarius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AquariusApplication {
    public static void main(String[] args) {
        SpringApplication.run(AquariusApplication.class, args);
    }
}
