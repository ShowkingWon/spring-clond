package com.example.cloudserverfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Eureka客户端。
 * 主要处理服务的注册与发现。客户端服务通过注解和参数配置的方式，嵌入在客户端应用程序的代码中，在应用程序运行时，Eureka客户端向注册中心注册自身提供的服务并周期性地发送心跳来更新它的服务续约。
 *
 * 同时，客户端能从服务端查询当前注册的服务信息并把它们缓存在本地并周期性刷新服务状态。
 *
 * 注意，在Spring Cloud Edgware以及更高版本后，只需要添加相关依赖，无需@EnableDiscoveryClient注解，即可自动注册
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class, args);
    }

}
