package com.seven.entity;

import java.util.concurrent.ExecutionException;

/**
 * @author Seven.Lin
 * @date 2020/2/9 18:44
 */
public interface IAsyncServiceApi {
    String say1(String msg) throws InterruptedException, ExecutionException;

    String say2(String msg) throws InterruptedException, ExecutionException;
}
