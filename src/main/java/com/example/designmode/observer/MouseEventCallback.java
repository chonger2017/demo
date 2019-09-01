package com.example.designmode.observer;

/**
 * 观察者
 * 响应的的逻辑
 */
public class MouseEventCallback {
    public void onclick(Event e) {
        System.out.println("==============触发鼠标单击事件============="+e);
    }

    public void onUp(Event e) {
        System.out.println("==============触发鼠标谈起事件============="+e);
    }

    public void onDown(Event e) {
        System.out.println("==============触发鼠标按下事件============="+e);
    }

    public void onMove(Event e) {
        System.out.println("==============触发鼠标移动事件============="+e);
    }

    public void onWheel(Event e) {
        System.out.println("==============触发鼠标滚动事件============="+e);
    }

    public void onOver(Event e) {
        System.out.println("==============触发鼠标悬停事件============="+e);
    }
}
