package com.leeyom.design.behavior.strategy;

/**
 * 策略抽象
 */
public interface Calculator {

    /**
     * 执行运算
     *
     * @param a 参数a
     * @param b 参数b
     * @return 运算结果
     */
    int exec(int a, int b);

}
