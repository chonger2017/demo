package com.example.designmode.observer;

public class Subject extends EventListener{
    public void add() {
        System.out.println("调用增加方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove() {
        System.out.println("调用删除方法");
        trigger(SubjectEventType.ON_REMOVE);
    }

}
