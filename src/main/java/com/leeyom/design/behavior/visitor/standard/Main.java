package com.leeyom.design.behavior.visitor.standard;

import java.util.List;

/**
 * client
 *
 * @author leeyom wang
 * @date 2020/9/5 5:25 下午
 */
public class Main {

    public static void main(String[] args) {
        List<Employee> employees = Factory.mockEmployee();
        Visitor visitor = new Visitor();
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
