# spring-cloud-eureka-server

## Eureka服务端。又称服务注册中心。
## 搭建服务注册中心
### 1.引入依赖（pom)
        <!-- Spring Cloud Eureka服务端组件依赖-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>

### 2.启用注解
     在服务启动类上通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话。
    在默认设置下，该服务注册中心也会将自己作为客户端来尝试注册它自己。可以通过在application.yml或者properties文件中，增加如下配置，禁用它的客户端注册行为。

    eureka.client.register-with-eureka=false
    eureka.client.fetch-registry=false
### 3.配置项目
    server.port
    
### 4.服务启动

