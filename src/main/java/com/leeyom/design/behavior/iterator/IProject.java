package com.leeyom.design.behavior.iterator;

/**
 * 项目接口抽象
 */
public interface IProject {

    /**
     * 新增项目
     *
     * @param name 项目名称
     * @param num  项目成员数量
     * @param cost 费用
     */
    void add(String name, int num, int cost);

    /**
     * 获取项目信息
     *
     * @return 项目信息
     */
    String getProjectInfo();

    /**
     * 获取迭代器
     *
     * @return 项目迭代器
     */
    IProjectIterator iterator();

}
