package com.seven.consumer;

import com.seven.entity.IAsyncServiceApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author Seven.Lin
 * @date 2020/2/9 18:45
 */
@Component
public class AsyncServiceApi {
    @Reference(interfaceClass = IAsyncServiceApi.class, timeout = 10000, async = true)
    private IAsyncServiceApi asyncServiceApi;

    public String say(String msg) throws InterruptedException, ExecutionException {
        asyncServiceApi.say1(msg);
        Future<String> helloFuture = RpcContext.getContext().getFuture();

        asyncServiceApi.say2(msg);
        Future<String> helloFuture2 = RpcContext.getContext().getFuture();
        return "say1=" + helloFuture.get() + "    say2=" + helloFuture2.get();
    }


}
