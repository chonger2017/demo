package com.example.designmode.singlemode;

import java.lang.reflect.Constructor;

public class LazyThreeTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyThree.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object obj = c.newInstance();
            Object obj2 = c.newInstance();
            System.out.println(obj == obj2 );
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
