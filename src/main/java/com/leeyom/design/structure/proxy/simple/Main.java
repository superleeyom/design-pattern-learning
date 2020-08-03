package com.leeyom.design.structure.proxy.simple;

public class Main {

    public static void main(String[] args) {
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy("张三");
        gamePlayerProxy.login("zhangsan", "123456");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }

}
