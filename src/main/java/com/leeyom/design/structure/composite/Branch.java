package com.leeyom.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 */
public class Branch extends Corp {

    private List<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    /**
     * 添加子节点
     *
     * @param corp 子节点
     */
    public void addSubordinate(Corp corp) {
        // 设置当前子节点的父节点
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    /**
     * 获取子节点列表
     *
     * @return 子节点列表
     */
    public List<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
