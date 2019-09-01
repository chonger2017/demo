package com.example.sharre;

public class TestSync {
    public synchronized void test1(){
        try {
            System.out.println("test1() 方法开始执行");
            Thread.sleep(2000);
            System.out.println("test1() 方法执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void test2(){
        try {
            System.out.println("test2() 方法开始执行");
            Thread.sleep(2000);
            System.out.println("test2() 方法执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
