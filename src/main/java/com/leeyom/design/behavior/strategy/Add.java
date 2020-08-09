package com.leeyom.design.behavior.strategy;

/**
 * 加法运算策略
 */
public class Add implements Calculator{

    public int exec(int a, int b) {
        return a + b;
    }
}
