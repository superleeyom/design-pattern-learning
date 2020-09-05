package com.leeyom.design.behavior.visitor.standard;

/**
 * 访问者实现
 *
 * @author leeyom
 */
public class Visitor implements IVisitor {


    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonInfo(commonEmployee));
    }

    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonInfo(CommonEmployee commonEmployee) {
        String basicInfo = getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
