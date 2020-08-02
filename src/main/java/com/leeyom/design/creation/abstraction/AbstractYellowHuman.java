package com.leeyom.design.creation.abstraction;

/**
 * 抽象黄色人种
 * 负责人种的抽象属性定义：语言和肤色
 */
public abstract class AbstractYellowHuman implements Human {

    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }

}
