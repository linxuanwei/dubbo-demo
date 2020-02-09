package com.seven.provider.service;

import com.seven.entity.IAsyncServiceApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * dubbo异步调用实现 使用sleep模拟耗时执行
 *
 * @author Seven.Lin
 * @date 2020/1/22 12:19
 */
@Component
@Service
public class AsyncServiceApiImpl implements IAsyncServiceApi {


    @Override
    public String say1(String msg) throws InterruptedException {
        Thread.sleep(4000);
        return "001-provider message is: " + msg;
    }

    @Override
    public String say2(String msg) throws InterruptedException {
        Thread.sleep(4000);
        return "002-provider message is: " + msg;
    }
}
