package com.seven.consumer.controller;

import com.seven.consumer.ServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Seven.Lin
 * @date 2020/1/22 12:30
 */
@RestController
public class ServiceController {
    @Resource
    private ServiceApi serviceApi;

    @GetMapping("/test")
    public String message(@RequestParam("msg") String msg) {
        return serviceApi.getMessage(msg);
    }
}
