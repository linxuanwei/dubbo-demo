package com.seven.consumer.service;

import com.seven.entity.IServiceApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author Seven.Lin
 * @date 2020/1/22 12:28
 */
@Component
public class ServiceApi {
    @Reference(interfaceClass = IServiceApi.class)
    private IServiceApi service;

    public String getMessage(String msg) throws InterruptedException {
        return service.say1(msg) + "\n" + service.say2(msg);
    }
}
