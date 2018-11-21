package com.daleyzou.rpc;

import com.sun.deploy.net.proxy.ProxyHandler;

/**
 * @Author: DaleyZou
 * @Description: 测试代理执行 sayHello
 * @Date: Created in 17:20 2018/11/21
 * @Modified By:
 */
public class Test {
    public static void main(String[] args){
        RPCProxyClient proxyClient = new RPCProxyClient(new HelloWorldServiceImpl());
        HelloWorldService helloWorldService = (HelloWorldService) proxyClient.proxyInstance();
        helloWorldService.sayHello();
    }
}
