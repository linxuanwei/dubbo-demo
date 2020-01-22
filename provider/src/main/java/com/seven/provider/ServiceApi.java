package com.seven.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.seven.entity.IServiceApi;
import org.springframework.stereotype.Component;

/**
 * @author Seven.Lin
 * @date 2020/1/22 12:19
 */
@Component
@Service(interfaceClass = IServiceApi.class)
public class ServiceApi implements IServiceApi {
    @Override
    public String say(String msg) {
        return "provider message is: " + msg;
    }
}
