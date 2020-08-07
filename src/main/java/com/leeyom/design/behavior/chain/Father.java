package com.leeyom.design.behavior.chain;

import cn.hutool.core.lang.Console;

/**
 * 父亲
 */
public class Father extends Handler {

    /**
     * 设置自己能处理的级别
     */
    public Father() {
        super(1);
    }

    /**
     * 父亲答复
     *
     * @param women 当前发起请示的妇女
     */
    @Override
    protected void response(IWomen women) {
        Console.log("女儿向父亲请示...");
        Console.log(women.getRequest());
        Console.log("父亲的答复是：同意");
    }
}
