package com.leeyom.design.behavior.visitor.multivisitor;

import com.leeyom.design.behavior.visitor.standard.IVisitor;

/**
 * 访问者-负责展示
 *
 * @author leeyom wang
 * @date 2020/9/5 6:13 下午
 */
public interface IShowVisitor extends IVisitor {

    /**
     * 展示表报
     */
    void report();

}
