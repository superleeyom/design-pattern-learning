package com.leeyom.design.behavior.visitor.standard;

import lombok.Data;

/**
 * 普通员工
 *
 * @author leeyom
 */
@Data
public class CommonEmployee extends Employee{

    /**
     * 工作
     */
    private String job;


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
