package com.generation.blogpessoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BlogpessoalApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogpessoalApplication.class, args);
    }
}