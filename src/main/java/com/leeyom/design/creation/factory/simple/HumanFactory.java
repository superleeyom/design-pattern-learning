package com.leeyom.design.creation.factory.simple;

import cn.hutool.core.lang.Console;
import com.leeyom.design.creation.factory.standard.Human;

/**
 * （简单工厂模式）人类创建工厂
 *
 * @author leeyom
 */
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            Console.error("人种生成错误...");
        }
        return (T) human;
    }
}
