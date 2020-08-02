package com.leeyom.design.creation.abstraction;

/**
 * 造人的八卦炉
 */
public interface HumanFactory {

    /**
     * 制造一个黄色人种
     *
     * @return
     */
    Human createYellowHuman();

    /**
     * 制造一个黑色人种
     *
     * @return
     */
    Human createBlackHuman();

    /**
     * 制造一个白色人种
     *
     * @return
     */
    Human createWhiteHuman();

}
