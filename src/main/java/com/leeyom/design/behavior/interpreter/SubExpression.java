package com.leeyom.design.behavior.interpreter;

import java.util.HashMap;

/**
 * 减法解析器
 *
 * @author leeyom wang
 * @date 2020/9/9 10:17 下午
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
