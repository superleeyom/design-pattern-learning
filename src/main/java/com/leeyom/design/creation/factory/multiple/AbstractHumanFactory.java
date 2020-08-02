package com.leeyom.design.creation.factory.multiple;

import com.leeyom.design.creation.factory.standard.Human;

/**
 * （多工厂模式）抽象人类创建工厂
 *
 * @author leeyom
 */
public abstract class AbstractHumanFactory {

    /**
     * 创建人类
     *
     * @return 人类
     */
    public abstract Human createHuman();

}
