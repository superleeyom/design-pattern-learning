package com.leeyom.design.behavior.chain;

import cn.hutool.core.lang.Console;

/**
 * 处理抽象
 */
public abstract class Handler {

    /**
     * 能处理的级别
     */
    private int level = 0;

    /**
     * 责任传递，下一个处理人
     */
    private Handler nextHandler;


    /**
     * 设置自己能处理的级别
     *
     * @param level 级别
     */
    public Handler(int level) {
        this.level = level;
    }

    /**
     * 设置下一个处理环节是谁
     *
     * @param handler 下个处理环节
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 回应，各个实现类的实现
     *
     * @param women 当前发起请示的妇女
     */
    protected abstract void response(IWomen women);

    /**
     * 处理请求
     *
     * @param women 当前发起请示的妇女
     */
    public final void handleMessage(IWomen women) {
        if (this.level == women.getType()) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                // 递归
                this.nextHandler.handleMessage(women);
            } else {
                Console.log("已经没有地方请示了，按照不同意处理...");
            }
        }
    }

}
