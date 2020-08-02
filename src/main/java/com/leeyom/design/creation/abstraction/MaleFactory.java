package com.leeyom.design.creation.abstraction;

/**
 * 生产男性的八卦炉
 */
public class MaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
