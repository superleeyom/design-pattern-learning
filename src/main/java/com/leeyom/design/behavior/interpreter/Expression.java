package com.leeyom.design.behavior.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式类
 *
 * @author leeyom wang
 * @date 2020/9/9 10:04 下午
 */
public abstract class Expression {

    /**
     * 解析公式和数值
     *
     * @param var key值是公式中的参数，value值是具体的数字
     * @return 结果
     */
    public abstract int interpreter(HashMap<String, Integer> var);


}
