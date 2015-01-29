package com.nibado.example.springmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class SpringMongoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringMongoApplication.class, args);
    }
}
