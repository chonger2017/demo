package com.example.designmode.singlemode.test;

import com.example.designmode.singlemode.Hungry;
import com.example.designmode.singlemode.LazyOne;
import com.example.designmode.singlemode.LazyThree;
import com.example.designmode.singlemode.LazyTwo;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {

    public static void main(String[] args) {
        int count =200000000;
//        CountDownLatch latch = new CountDownLatch(count);
//
//        final Set<Hungry> synnSet = Collections.synchronizedSet(new HashSet<Hungry>());
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Object obj = LazyTwo.getInstance();
//            new Thread(){
//                @Override
//                public void run() {
//                    //Hungry.getInstance();
//                    try {
//                        latch.await();
//                        Object obj = LazyThree.getInstance();
//                        System.out.println(System.currentTimeMillis()+":"+obj);
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }.start();
//
//            latch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时 : "+(end-start));

        try {
            Class<?> clazz = LazyThree.class;
            Constructor[] c = clazz.getDeclaredConstructors();
            for (Constructor c1: c) {
                c1.setAccessible(true);
                Object obj = c1.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
