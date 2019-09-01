package com.example.controller;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fibonacci implements Runnable {

    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public  int f(int y){
        return  y > 2 ? f(y-1) + f(y-2):1;
    }

    @Override
    public void run() {
        for(int i=1; i<=n; i++){
            System.out.println(f(i));
        }
    }

    public static void main(String[] args) {
        /*ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Fibonacci(7));
        exec.shutdown();*/
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(new Fibonacci(9));
        exec.shutdown();
    }
}
