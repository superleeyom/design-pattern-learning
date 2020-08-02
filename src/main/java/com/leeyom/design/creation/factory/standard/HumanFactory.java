package com.leeyom.design.creation.factory.standard;

import cn.hutool.core.lang.Console;

/**
 * 人类创建工厂
 *
 * @author leeyom
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            Console.error("人种生成错误...");
        }
        return (T) human;
    }
}
