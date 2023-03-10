package com.ye.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ye.back")
public class EducationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationBackApplication.class, args);
    }

}
