package com.leeyom.design.creation.singleton.lazy;

import lombok.extern.slf4j.Slf4j;

/**
 * 单例模式：懒汉式
 * 存在线程安全问题，解决线程不安全的方法很有多，可以在getSingleton方法前加synchronized关键字，
 * 也可以在getSingleton方法内增加synchronized来实现
 *
 * @author leeyom
 */
@Slf4j
public class Singleton {

    private static Singleton SINGLETON = null;

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
    public static synchronized Singleton getSingleton() {
        if (SINGLETON == null) {
            return new Singleton();
        }
        return SINGLETON;
    }

    /**
     * 类中的其他方法
     */
    public void doSomething() {
        log.info("doSomething...");
    }

}
