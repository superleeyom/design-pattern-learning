package com.leeyom.design.creation.factory.multiple;

import cn.hutool.core.lang.Console;
import com.leeyom.design.creation.factory.standard.Human;

/**
 * 女娲（多工厂模式）
 *
 * @author leeyom
 */
public class NvWa {

    /**
     * 女娲造人
     *
     * @param args
     */
    public static void main(String[] args) {

        // 女娲第一次造人，火候不足，于是白人产生了￼ 
        Console.log("--造出的第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        // 女娲第二次造人，火候过足，于是黑人产生了￼ 
        Console.log("--造出的第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        // 第三次造人，火候刚刚好，于是黄色人种产生了￼ 
        Console.log("--造出的第三批人是黄色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();

    }

}
