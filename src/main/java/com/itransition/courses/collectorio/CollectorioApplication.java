package com.itransition.courses.collectorio;

import com.itransition.courses.collectorio.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class CollectorioApplication {
    public static void main(String[] args) {
        SpringApplication.run(CollectorioApplication.class, args);
    }
}
