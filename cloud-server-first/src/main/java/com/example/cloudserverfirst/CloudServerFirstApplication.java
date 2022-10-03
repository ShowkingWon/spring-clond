package com.example.cloudserverfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Eureka服务端。
 * 又称服务注册中心。
 *
 *
 */
@SpringBootApplication
@EnableEurekaServer // 启动注册中心
public class CloudServerFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerFirstApplication.class, args);
    }

}
