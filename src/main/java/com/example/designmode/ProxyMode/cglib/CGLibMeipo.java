package com.example.designmode.ProxyMode.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibMeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        //要把那个类设置成即将生成的新类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务增强
        System.out.println("我是58，我要给你找工作，现在已经拿到你的简历");
        System.out.println("开始投递");
        methodProxy.invokeSuper(o, objects);
        System.out.println("安排面试");
        return null;
    }
}
