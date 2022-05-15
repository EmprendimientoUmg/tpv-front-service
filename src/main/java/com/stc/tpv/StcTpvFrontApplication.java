package com.stc.tpv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StcTpvFrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(StcTpvFrontApplication.class, args);
    }
}