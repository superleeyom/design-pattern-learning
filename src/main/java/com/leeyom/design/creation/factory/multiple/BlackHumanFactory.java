package com.leeyom.design.creation.factory.multiple;

import com.leeyom.design.creation.factory.standard.BlackHuman;
import com.leeyom.design.creation.factory.standard.Human;

/**
 * 黑色人种创建工厂
 *
 * @author leeyom
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
