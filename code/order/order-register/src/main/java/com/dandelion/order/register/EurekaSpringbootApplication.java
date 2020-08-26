package com.dandelion.order.register;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//开启注册中心
public class EurekaSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSpringbootApplication.class, args);
    }

    public void test() {
        int i = 0;
        i += 10;
    }
}
