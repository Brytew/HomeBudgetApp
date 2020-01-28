package com.homebudget.homeentirety;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
@SpringBootApplication
public class HomeBudgetApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeBudgetApplication.class, args);
    }
}
