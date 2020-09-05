package com.leeyom.design.behavior.visitor.multivisitor;

import com.leeyom.design.behavior.visitor.standard.CommonEmployee;
import com.leeyom.design.behavior.visitor.standard.Manager;

/**
 * 负责统计所有员工薪水
 *
 * @author leeyom wang
 * @date 2020/9/5 6:20 下午
 */
public class TotalVisitor implements ITotalVisitor {

    /**
     * 部门经理的工资系数是5
     */
    private final static int MANAGER_COEFFICIENT = 5;
    /**
     * 员工的工资系数是2
     */
    private final static int COMMON_EMPLOYEE_COEFFICIENT = 2;
    /**
     * 普通员工的工资总和
     */
    private int commonTotalSalary = 0;
    /**
     * 部门经理的工资总和
     */
    private int managerTotalSalary = 0;

    public void totalSalary() {
        System.out.println("本公司的月工资总额是" + (this.commonTotalSalary + this.managerTotalSalary));
    }

    /**
     * 访问普通员工，计算工资总额
     *
     * @param commonEmployee 普通员工
     */
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary() * COMMON_EMPLOYEE_COEFFICIENT;
    }

    /**
     * 访问部门经理，计算工资总额
     *
     * @param manager 经理
     */
    public void visit(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary() * MANAGER_COEFFICIENT;
    }
}
