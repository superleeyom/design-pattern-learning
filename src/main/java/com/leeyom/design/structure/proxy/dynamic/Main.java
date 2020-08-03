package com.leeyom.design.structure.proxy.dynamic;


import com.leeyom.design.structure.proxy.simple.GamePlayer;
import com.leeyom.design.structure.proxy.simple.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayHandler(gamePlayer);
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);
        proxy.login("张三", "123456");
        proxy.killBoss();
        proxy.upgrade();
    }

}
