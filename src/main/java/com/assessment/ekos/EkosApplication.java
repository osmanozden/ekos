package com.assessment.ekos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.assessment.ekos")
public class EkosApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkosApplication.class, args);
    }

}
