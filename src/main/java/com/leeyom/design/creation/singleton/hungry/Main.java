package com.leeyom.design.creation.singleton.hungry;

public class Main {

    public static void main(String[] args) {
        // 获取实例
        Singleton singleton = Singleton.getSingleton();
        // 执行实例方法
        singleton.doSomething();
    }

}
