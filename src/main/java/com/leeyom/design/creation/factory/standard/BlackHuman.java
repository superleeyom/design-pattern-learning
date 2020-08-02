package com.leeyom.design.creation.factory.standard;

import cn.hutool.core.lang.Console;

/**
 * 黑人
 *
 * @author leeyom
 */
public class BlackHuman implements Human {

    public void getColor() {
        Console.log("黑人的皮肤是黑色的...");
    }

    public void talk() {
        Console.log("黑人会说话，一般人听不懂...");
    }
}
