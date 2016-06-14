package org.breakfast.hrm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("org.breakfast.hrm")
public class BreakFastApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreakFastApplication.class, args);
    }
}
