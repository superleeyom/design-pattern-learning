package com.leeyom.design.structure.decorator;

import cn.hutool.core.lang.Console;

/**
 * 排名装饰器
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    /**
     * 装饰方法
     */
    public void reportSort() {
        Console.log("我的排名是第38名，但是全班一共45名同学...");
    }

    @Override
    public void report() {
        super.report();
        // 报告完成绩后，顺便说下自己在班上的排名
        this.reportSort();
    }
}
