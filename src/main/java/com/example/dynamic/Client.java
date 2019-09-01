package com.example.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject realsubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realsubject);
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),realsubject.getClass().getInterfaces(),handler);
        System.out.println(subject.getClass().getName());
        subject.rent();
        subject.hello("world");
    }
}
