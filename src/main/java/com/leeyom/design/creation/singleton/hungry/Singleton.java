package com.leeyom.design.creation.singleton.hungry;

import cn.hutool.core.lang.Console;

/**
 * 单例模式：饿汉式（推荐）
 *
 * @author leeyom
 */
public class Singleton {

    /**
     * 确保对象实例只有一个
     */
    private static final Singleton SINGLETON = new Singleton();

    /**
     * 构造器私有化，限制产生多个对象
     */
    private Singleton() {

    }

    /**
     * 通过该方法获取实例
     *
     * @return 实例
     */
    public static Singleton getSingleton() {
        return SINGLETON;
    }

    /**
     * 类中的其他方法
     */
    public void doSomething() {
        Console.log("doSomething...");
    }

}
