package com.daleyzou.rpc;

/**
 * @Author: DaleyZou
 * @Description: sayHello 的实现类
 * @Date: Created in 17:14 2018/11/21
 * @Modified By:
 */
public class HelloWorldServiceImpl implements HelloWorldService{
    @Override
    public void sayHello() {
        System.out.println("Hello world, my name is daleyzou!");
    }
}
