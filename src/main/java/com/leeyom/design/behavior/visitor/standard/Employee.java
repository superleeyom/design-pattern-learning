package com.leeyom.design.behavior.visitor.standard;

import lombok.Data;

/**
 * 员工
 *
 * @author leeyom
 */
@Data
public abstract class Employee {

    /**
     * 男性
     */
    public static final int MALE = 0;
    /**
     * 女性
     */
    public static final int FEMALE = 1;

    /**
     * 薪水
     */
    private int salary;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别，0男性，1女性
     */
    private int sex;


    /**
     * 接收访问者
     *
     * @param visitor 访问者
     */
    public abstract void accept(IVisitor visitor);

}
