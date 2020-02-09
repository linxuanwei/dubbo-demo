package com.seven.consumer.controller;

import com.seven.consumer.AsyncServiceApi;
import com.seven.consumer.ServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;

/**
 * @author Seven.Lin
 * @date 2020/1/22 12:30
 */
@RestController
public class ServiceController {
    @Resource
    private ServiceApi serviceApi;

    @Resource
    private AsyncServiceApi asyncServiceApi;

    @GetMapping("/test")
    public String message(@RequestParam("msg") String msg) throws InterruptedException {
        return serviceApi.getMessage(msg);
    }

    @GetMapping("/test/async")
    public String asyncMessage(@RequestParam("msg") String msg) throws InterruptedException, ExecutionException {
        Long start = System.currentTimeMillis();
        String a = asyncServiceApi.say(msg);
        Long end = System.currentTimeMillis();
        return a + " time:" + (end - start);
    }
}
