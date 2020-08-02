package com.leeyom.design.creation.factory.simple;

import cn.hutool.core.lang.Console;
import com.leeyom.design.creation.factory.standard.BlackHuman;
import com.leeyom.design.creation.factory.standard.Human;
import com.leeyom.design.creation.factory.standard.WhiteHuman;
import com.leeyom.design.creation.factory.standard.YellowHuman;

/**
 * 女娲（简单工厂模式）
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
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 女娲第二次造人，火候过足，于是黑人产生了￼ 
        Console.log("--造出的第二批人是黑色人种--");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        // 第三次造人，火候刚刚好，于是黄色人种产生了￼ 
        Console.log("--造出的第三批人是黄色人种--");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }

}
