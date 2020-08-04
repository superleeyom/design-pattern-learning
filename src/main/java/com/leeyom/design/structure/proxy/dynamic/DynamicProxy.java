package com.leeyom.design.structure.proxy.dynamic;

import com.leeyom.design.structure.proxy.simple.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 * @param <T>
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(IGamePlayer gamePlayer) {
        ClassLoader loader = gamePlayer.getClass().getClassLoader();
        Class<?>[] interfaces = gamePlayer.getClass().getInterfaces();
        // 前置通知
        (new BeforeAdvice()).exec();
        return (T) Proxy.newProxyInstance(loader, interfaces, new GamePlayHandler(gamePlayer));
    }

}
