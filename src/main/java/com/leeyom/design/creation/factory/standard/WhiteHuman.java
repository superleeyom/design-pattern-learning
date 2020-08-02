package com.leeyom.design.creation.factory.standard;

import cn.hutool.core.lang.Console;

/**
 * 白人
 */
public class WhiteHuman implements Human {

    public void getColor() {
        Console.log("白种人的皮肤是白色的...");
    }

    public void talk() {
        Console.log("白种人会说话，一般都是单字节...");
    }

}
