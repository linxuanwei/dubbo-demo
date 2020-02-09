package com.seven.provider.service;

import com.seven.entity.IServiceApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * 同步代码实现示例
 *
 * @author Seven.Lin
 * @date 2020/1/22 12:19
 */
@Component
@Service
public class ServiceApiImpl implements IServiceApi {


    @Override
    public String say1(String msg) {
        return "001-provider message is: " + msg;
    }

    @Override
    public String say2(String msg) {
        return "002-provider message is: " + msg;
    }
}
