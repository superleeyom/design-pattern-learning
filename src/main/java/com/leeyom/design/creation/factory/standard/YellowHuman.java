package com.leeyom.design.creation.factory.standard;

import cn.hutool.core.lang.Console;

/**
 * 黄种人
 */
public class YellowHuman implements Human {

    public void getColor() {
        Console.log("黄种人的皮肤是黄色的...");
    }

    public void talk() {
        Console.log("黄种人会说话，一般说的都是双字节...");
    }
}
