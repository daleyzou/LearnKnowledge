package com.daleyzou.rpc;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: DaleyZou
 * @Description: 实现RPCProxyClient代理类，代理类的invoke方法中封装了与远端服务通信的细节
 * @Date: Created in 16:49 2018/11/21
 * @Modified By:
 */
public class RPCProxyClient implements java.lang.reflect.InvocationHandler {
    private Object obj;

    public RPCProxyClient(Object obj) {
        this.obj = obj;
    }
    
    public Object proxyInstance(){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("aspect before...");
        Object result = method.invoke(this.obj, args);
        System.out.println("aspect after...");
        return result;
    }
}
