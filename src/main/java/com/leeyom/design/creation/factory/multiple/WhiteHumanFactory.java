package com.leeyom.design.creation.factory.multiple;

import com.leeyom.design.creation.factory.standard.Human;
import com.leeyom.design.creation.factory.standard.WhiteHuman;

/**
 * 白色人种创建工厂
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
