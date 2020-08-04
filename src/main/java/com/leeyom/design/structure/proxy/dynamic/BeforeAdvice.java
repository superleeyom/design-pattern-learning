package com.leeyom.design.structure.proxy.dynamic;

import cn.hutool.core.lang.Console;

public class BeforeAdvice implements IAdvice{

    public void exec() {
        Console.log("我是前置通知，我被执行了...");
    }
}
