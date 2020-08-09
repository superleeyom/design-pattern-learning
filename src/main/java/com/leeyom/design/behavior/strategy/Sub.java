package com.leeyom.design.behavior.strategy;

/**
 * 减法运算策略
 */
public class Sub implements Calculator {

    public int exec(int a, int b) {
        return a - b;
    }
}
