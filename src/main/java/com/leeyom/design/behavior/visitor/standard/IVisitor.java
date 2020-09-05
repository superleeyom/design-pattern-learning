package com.leeyom.design.behavior.visitor.standard;

/**
 * 访问者抽象
 *
 * @author leeyom
 */
public interface IVisitor {

    /**
     * 访问普通员工
     *
     * @param commonEmployee 普通员工
     */
    void visit(CommonEmployee commonEmployee);

    /**
     * 访问部门经理
     *
     * @param manager 经理
     */
    void visit(Manager manager);


}
