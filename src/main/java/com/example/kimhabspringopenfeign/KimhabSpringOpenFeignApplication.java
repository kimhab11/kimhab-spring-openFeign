package com.example.kimhabspringopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KimhabSpringOpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(KimhabSpringOpenFeignApplication.class, args);
    }

}
