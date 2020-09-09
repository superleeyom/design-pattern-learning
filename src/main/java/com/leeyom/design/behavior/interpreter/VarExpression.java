package com.leeyom.design.behavior.interpreter;

import java.util.HashMap;

/**
 * 变量解析器
 *
 * @author leeyom wang
 * @date 2020/9/9 10:09 下午
 */
public class VarExpression extends Expression {

    /**
     * 公式中的参数
     */
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }


    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
