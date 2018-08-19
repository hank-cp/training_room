package com.atsoa.trainingroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.atsoa.trainingroom.repository")
@EntityScan(basePackages = "com.atsoa.trainingroom.model")
public class TrainingRoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingRoomApplication.class, args);
    }

}
