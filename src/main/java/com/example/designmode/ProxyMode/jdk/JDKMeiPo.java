package com.example.designmode.ProxyMode.jdk;

import com.example.designmode.ProxyMode.staticted.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeiPo implements InvocationHandler {

    //被代理的对象
    private Person target;

    public Object getInstance(Person daniel) throws Exception{
        this.target = daniel;

        Class<?> clazz = target.getClass();

        //用来生成一个新的对象 (字节码重组来实现)
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        System.out.println("我是媒婆，我要给你找对象，现在已经拿到你的需求了");
//        System.out.println("开始物色");
        System.out.println("我是58，我要给你找工作，现在已经拿到你的简历");
        System.out.println("开始投递");
        method.invoke(this.target, args);

//        System.out.println("如果合适的话，就准备办事");
        System.out.println("安排面试");
        return null;
    }
}
