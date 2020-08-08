package com.leeyom.design.structure.decorator;

import cn.hutool.core.lang.Console;

/**
 * 装饰分数
 */
public class HighScoreDecorator extends Decorator {


    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    /**
     * 装饰方法
     */
    public void reportHighScore() {
        Console.log("语文最高分75分，数学最高分70分，自然最高分80分...");
    }

    @Override
    public void report() {
        // 报告自己的成绩前，先告诉各科的最高分是多少，还有个对比
        this.reportHighScore();
        super.report();
    }
}
