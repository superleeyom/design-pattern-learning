package com.leeyom.design.creation.abstraction;

/**
 * 生产女性的八卦炉
 */
public class FemaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
