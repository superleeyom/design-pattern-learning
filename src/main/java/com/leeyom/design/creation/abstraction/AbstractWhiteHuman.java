package com.leeyom.design.creation.abstraction;

/**
 * 抽象白色人种
 * 负责人种的抽象属性定义：语言和肤色
 */
public abstract class AbstractWhiteHuman implements Human {

    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }

}
