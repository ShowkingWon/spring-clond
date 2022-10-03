package com.master.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jerry Wan on 2020/9/7.
 * @description
 * @date 2022-10-03 15:26
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 用户首页.
     *
     * @description .
     * @author Jerry Wan
     * @date 2020/9/7 11:42
     */
    @GetMapping("/index")
    public String index() {
        //return "hello consumer";
        String hh = "1111111111";
        System.out.println(hh);
        return restTemplate.getForEntity("http://order-service/order/index", String.class).getBody();
    }

}
