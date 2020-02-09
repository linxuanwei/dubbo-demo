package com.seven.provider;

import com.seven.entity.IServiceApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author Seven.Lin
 * @date 2020/1/22 12:19
 */
@Component
@Service
public class ServiceApi implements IServiceApi {


    @Override
    public String say1(String msg) throws InterruptedException {
        Thread.sleep(1000);
        return "001-provider message is: " + msg;
    }

    @Override
    public String say2(String msg) throws InterruptedException {
        Thread.sleep(3000);
        return "002-provider message is: " + msg;
    }
}
