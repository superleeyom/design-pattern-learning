package com.leeyom.design.behavior.chain;

import cn.hutool.core.lang.Console;

/**
 * 儿子
 */
public class Son extends Handler {

    public Son() {
        super(3);
    }

    @Override
    protected void response(IWomen women) {
        Console.log("母亲向儿子请示...");
        Console.log(women.getRequest());
        Console.log("儿子的答复是：同意");
    }
}
