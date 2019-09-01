package com.example.controller;

import ch.qos.logback.classic.net.SimpleSocketServer;

import java.util.concurrent.TimeUnit;

public class SImpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread()+"  "+ this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<10; i++){
            Thread daemon = new Thread(new SImpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(17500);
    }
}
