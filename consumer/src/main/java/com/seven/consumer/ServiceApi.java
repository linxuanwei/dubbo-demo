package com.seven.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.seven.entity.IServiceApi;
import org.springframework.stereotype.Component;

/**
 * @author Seven.Lin
 * @date 2020/1/22 12:28
 */
@Component
public class ServiceApi {
    @Reference
    private IServiceApi service;

    public String getMessage(String msg) {
        return service.say(msg);
    }
}
