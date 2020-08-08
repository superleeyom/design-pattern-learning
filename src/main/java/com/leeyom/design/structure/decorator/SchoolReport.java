package com.leeyom.design.structure.decorator;

/**
 * 成绩报告抽象
 */
public abstract class SchoolReport {

    /**
     * 报告成绩
     */
    public abstract void report();

    /**
     * 家长签名
     *
     * @param name 家长姓名
     */
    public abstract void sign(String name);

}
