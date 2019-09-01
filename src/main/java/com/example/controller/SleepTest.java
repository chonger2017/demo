package com.example.controller;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SleepTest implements Runnable {
    @Override
    public void run() {
        long random = (long)(Math.random()*10 + 1);
//        System.out.println(random);
        try {
            Thread.sleep(random * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("my delay time is"+random);
    }

    public static void main(String[] args) {
        /*ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0; i<5; i++){
            exec.execute(new SleepTest());
        }
        exec.shutdown();*/
        AtomicInteger atomicI = new AtomicInteger(0);
        int i = atomicI.get();
        System.out.println(i+"-----");
        //i++;
        boolean b = atomicI.compareAndSet(i, ++i);
        System.out.println(b + "===" + i);

    }
}
