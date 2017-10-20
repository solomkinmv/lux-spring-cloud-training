package com.luxoft.training.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class ProcessingService {
    public static void main(String[] args) {
        SpringApplication.run(ProcessingService.class, args);
    }
}
