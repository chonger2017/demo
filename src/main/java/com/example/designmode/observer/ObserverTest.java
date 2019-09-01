package com.example.designmode.observer;

import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) {
        try {
            Observer observer = new Observer();
            Method me = Observer.class.getMethod("advice", new Class[]{Event.class});

            Subject subject = new Subject();
            subject.addListener(SubjectEventType.ON_ADD, observer, me);
            subject.addListener(SubjectEventType.ON_REMOVE, observer, me);
            subject.add();
            subject.remove();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
