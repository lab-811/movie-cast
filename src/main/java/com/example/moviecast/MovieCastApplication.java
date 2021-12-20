package com.example.moviecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MovieCastApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieCastApplication.class, args);
    }


}
