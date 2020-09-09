package com.leeyom.design.behavior.interpreter;

import java.util.HashMap;

/**
 * 加法解析器
 *
 * @author leeyom wang
 * @date 2020/9/9 10:14 下午
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 把左右两个表达式的运算结果加起来
     *
     * @param var key值是公式中的参数，value值是具体的数字
     * @return 结果
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
