package com.example.controller;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable implements Runnable {

    private  static  int taskcount = 0;
    private  final  int id = taskcount++;

    public MyRunnable() {
        System.out.println("创建了一个实例"+id);
    }

    @Override
    public void run() {
        for(int i=0; i< 3; i++) {
            System.out.println("#("+id+")执行线程run方法");
            Thread.yield();
        }
        System.out.println("#("+id+")执行结束了");
    }

    public static void main(String[] args) {
//        Thread t = new Thread(new MyRunnable());
//        t.start();
//        ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for(int i=0; i<5; i++){
            exec.execute(new MyRunnable());
        }
        exec.shutdown();
    }
}
