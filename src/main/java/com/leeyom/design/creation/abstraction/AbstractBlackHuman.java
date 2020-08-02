package com.leeyom.design.creation.abstraction;

/**
 * 抽象黑色人种
 * 负责人种的抽象属性定义：语言和肤色
 */
public abstract class AbstractBlackHuman implements Human {

    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }

}
