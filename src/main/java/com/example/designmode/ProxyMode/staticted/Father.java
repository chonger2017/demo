package com.example.designmode.ProxyMode.staticted;

public class Father {

    private Son person;

    public Father(Son person){
        this.person = person;
    }

    //目标对象的引用拿到
    public void findLove(){
        System.out.println("to find a person who match your request");
        this.person.findLove();
        System.out.println("both families agree ");
    }
}
