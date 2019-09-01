package com.example.controller;

import java.util.concurrent.*;

public class Fibonacci2 implements Callable<Integer> {

    private int n;

    public int f(int y){
        return y>2 ? f(y-1)+f(y-2) : 1;
    }

    public Fibonacci2(int n){
        this.n = n;
    }

    @Override
    public Integer call(){
        Integer sum = 0;
        for(int i=0; i<n; i++){
            sum += f(i);
//            System.out.println(f(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0; i<5; i++) {
            Future<Integer> f = exec.submit(new Fibonacci2(8+i));
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        exec.shutdown();
    }
}
