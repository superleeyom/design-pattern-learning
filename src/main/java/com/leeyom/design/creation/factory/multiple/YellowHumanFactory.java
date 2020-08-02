package com.leeyom.design.creation.factory.multiple;

import com.leeyom.design.creation.factory.standard.Human;
import com.leeyom.design.creation.factory.standard.YellowHuman;

/**
 * 黄色人种创建工厂
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
