package com.leeyom.design.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目实现
 */
public class Project implements IProject {

    /**
     * 项目列表
     */
    private List<IProject> projectList = new ArrayList<IProject>();

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目成员数量
     */
    private int num;

    /**
     * 项目花费
     */
    private int cost;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    public Project() {

    }

    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是：" + this.name;
        info = info + "\t项目人数是：" + this.num;
        info = info + "\t项目费用是：" + this.cost;
        return info;
    }

    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
