package com.example.designmode.observer;

import java.lang.reflect.Method;

public class MouseTest {
    public static void main(String[] args) {
        /**
         * var input = document.getElementById("username");
         *
         * input.addListen
         */

        /**
         * 观察者和被观察者没有必然联系
         * 注册时候，才能产生联系
         */

        try {
            Mouse mouse = new Mouse();
//            MouseEventCallback callback = new MouseEventCallback();
//            Method onclick = MouseEventCallback.class.getMethod("onclick", Event.class);
//            mouse.addListener(MouseEventType.ON_CLICK, callback, onclick);
            mouse.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
