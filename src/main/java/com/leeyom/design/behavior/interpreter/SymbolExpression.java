package com.leeyom.design.behavior.interpreter;

/**
 * 运算符号解析器
 *
 * @author leeyom wang
 * @date 2020/9/9 10:11 下午
 */
public abstract class SymbolExpression extends Expression {


    Expression left;
    Expression right;

    /**
     * 每个运算符号只和左右的两个表达式相关
     *
     * @param left  左表达式
     * @param right 右表达式
     */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
