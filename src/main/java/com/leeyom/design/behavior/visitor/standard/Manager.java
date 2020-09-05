package com.leeyom.design.behavior.visitor.standard;

import lombok.Data;

/**
 * 部门经理
 *
 * @author leeyom
 */
@Data
public class Manager extends Employee {

    /**
     * 业绩
     */
    private String performance;


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
