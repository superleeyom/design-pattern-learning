package com.leeyom.design.creation.abstraction;

import cn.hutool.core.lang.Console;

/**
 * 女娲造人
 */
public class NvWa {

    public static void main(String[] args) {

        // 创建工厂
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        // 工厂开始生产人，首先生产黄色男人和女人
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        Console.log("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        Console.log("---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();

        // 生产黑色男人和女人同上...
        // 略...
        // 生产白色男人和女人同上...
        // 略...
    }

}
