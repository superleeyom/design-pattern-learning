package com.leeyom.design.structure.proxy.dynamic;


import com.leeyom.design.structure.proxy.simple.GamePlayer;
import com.leeyom.design.structure.proxy.simple.IGamePlayer;

public class Main {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer proxy = DynamicProxy.newProxyInstance(gamePlayer);
        proxy.login("张三", "123456");
        proxy.killBoss();
        proxy.upgrade();
    }

}
