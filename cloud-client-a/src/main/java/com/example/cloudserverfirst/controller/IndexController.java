package com.example.cloudserverfirst.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/a/index")
@Slf4j
public class IndexController {

    @Autowired
    private DiscoveryClient client;


    @GetMapping("/hello")
    public String hello(){
        List<String> services = client.getServices();
        return "hello !  " + StringUtils.join(services, ",");
    }
}
