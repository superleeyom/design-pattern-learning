package com.leeyom.design.creation.factory.standard;

/**
 * 抽象人类创建工厂
 *
 * @author leeyom
 */
public abstract class AbstractHumanFactory {

    /**
     * 创建人类
     *
     * @return 人类
     */
    public abstract <T extends Human> T createHuman(Class<T> c);

}
