package com.example.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object subject;

    public DynamicProxy(Object subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在代理真是对象前，我们可以添加下自己的操作
        System.out.println("before rent house");

        System.out.println("Method:"+method);

        method.invoke(subject,args);

        System.out.println("after rent house");
        return null;
    }
}
