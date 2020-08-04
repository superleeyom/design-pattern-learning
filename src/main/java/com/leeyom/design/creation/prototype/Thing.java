package com.leeyom.design.creation.prototype;

import cn.hutool.core.lang.Console;

public class Thing implements Cloneable {

    /**
     * 原型模式下，构造函数不会执行
     */
    public Thing() {
        Console.log("构造函数执行了...");
    }

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
