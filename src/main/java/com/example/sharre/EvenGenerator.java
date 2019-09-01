package com.example.sharre;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static int test(){
        int val = 1;
        try {
            return val++;
        }finally {
            System.out.println("hello world");
        }

    }

    public static void main(String[] args) {
        //EvenChecker.test(new EvenGenerator());
        TestSync ts = new TestSync();
        TestSync ts2 = new TestSync();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new TestRunable1(ts));
        exec.execute(new TestRunable2(ts2));
        exec.shutdown();
//        System.out.println(EvenGenerator.test());
    }
}
