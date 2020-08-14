package com.leeyom.design.structure.composite;

import cn.hutool.core.util.ObjectUtil;

/**
 * 公司职员抽象
 */
public abstract class Corp {

    /**
     * 姓名
     */
    private String name;
    /**
     * 职位
     */
    private String position;
    /**
     * 薪水
     */
    private int salary;

    /**
     * 上级
     */
    private Corp parent;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
     * 获取员工信息
     *
     * @return 员工信息
     */
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        info = info + "\t上级：" + (ObjectUtil.isNotNull(this.parent) ? parent.getName() : "无");
        return info;
    }

    /**
     * 获取上级信息
     *
     * @return 上级
     */
    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
