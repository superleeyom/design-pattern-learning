package com.leeyom.design.behavior.chain;

import cn.hutool.core.lang.Console;

/**
 * 丈夫
 */
public class Husband extends Handler {

    public Husband() {
        super(2);
    }

    @Override
    protected void response(IWomen women) {
        Console.log("妻子向丈夫请示...");
        Console.log(women.getRequest());
        Console.log("丈夫的答复是：同意");
    }
}
