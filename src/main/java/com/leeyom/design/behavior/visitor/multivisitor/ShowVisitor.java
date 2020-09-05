package com.leeyom.design.behavior.visitor.multivisitor;

import com.leeyom.design.behavior.visitor.standard.CommonEmployee;
import com.leeyom.design.behavior.visitor.standard.Employee;
import com.leeyom.design.behavior.visitor.standard.Manager;

/**
 * 负责展示表报
 *
 * @author leeyom wang
 * @date 2020/9/5 6:14 下午
 */
public class ShowVisitor implements IShowVisitor {

    private String info = "";

    public void report() {
        System.out.println(this.info);
    }

    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + getBasicInfo(commonEmployee) + "工作：" + commonEmployee.getJob() + "\t\n";
    }

    public void visit(Manager manager) {
        this.info = this.info + getBasicInfo(manager) + "业绩：" + manager.getPerformance() + "\t\n";
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }
}
