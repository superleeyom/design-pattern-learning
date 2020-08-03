package com.leeyom.design.structure.proxy.dynamic;

import cn.hutool.core.lang.Console;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class GamePlayHandler implements InvocationHandler {

    /**
     * 被代理者
     */
    Class cls = null;

    /**
     * 被代理的实例
     */
    Object obj = null;

    /**
     * 我要代理谁
     *
     * @param obj 被代理者
     */
    public GamePlayHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        // 在登录后，发送一条消息
        if (method.getName().equalsIgnoreCase("login")) {
            Console.log("有人在登录我的账号");
        }
        return result;
    }
}
