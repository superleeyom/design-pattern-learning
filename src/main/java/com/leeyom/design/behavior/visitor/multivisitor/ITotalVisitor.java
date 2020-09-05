package com.leeyom.design.behavior.visitor.multivisitor;

import com.leeyom.design.behavior.visitor.standard.IVisitor;

/**
 * 访问者-汇总薪水
 *
 * @author leeyom wang
 * @date 2020/9/5 6:19 下午
 */
public interface ITotalVisitor extends IVisitor {

    /**
     * 统计所有的员工的薪水
     */
    void totalSalary();

}
