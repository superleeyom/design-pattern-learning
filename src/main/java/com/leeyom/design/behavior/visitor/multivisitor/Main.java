package com.leeyom.design.behavior.visitor.multivisitor;

import com.leeyom.design.behavior.visitor.standard.Employee;
import com.leeyom.design.behavior.visitor.standard.Factory;

import java.util.List;

/**
 * client
 *
 * @author leeyom wang
 * @date 2020/9/5 6:25 下午
 */
public class Main {

    public static void main(String[] args) {
        ShowVisitor showVisitor = new ShowVisitor();
        TotalVisitor totalVisitor = new TotalVisitor();
        List<Employee> employees = Factory.mockEmployee();
        for (Employee employee : employees) {
            employee.accept(showVisitor);
            employee.accept(totalVisitor);
        }
        // 展示员工报表信息
        showVisitor.report();
        // 计算公司工资总额
        totalVisitor.totalSalary();
    }

}
