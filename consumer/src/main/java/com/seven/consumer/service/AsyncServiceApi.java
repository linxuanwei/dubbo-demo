package com.seven.consumer.service;

import com.seven.entity.IAsyncServiceApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 异步调用provider接口
 *
 * @author Seven.Lin
 * @date 2020/2/9 18:45
 */
@Component
public class AsyncServiceApi {
    // 声明为异步 async=true
    @Reference(interfaceClass = IAsyncServiceApi.class, timeout = 10000, async = true)
    private IAsyncServiceApi asyncServiceApi;

    public String say(String msg) throws InterruptedException, ExecutionException {
        asyncServiceApi.say1(msg);
        Future<String> helloFuture = RpcContext.getContext().getFuture();

        asyncServiceApi.say2(msg);
        Future<String> helloFuture2 = RpcContext.getContext().getFuture();
        return "say1=" + helloFuture.get() + "\nsay2=" + helloFuture2.get() + "\n";
    }


}
