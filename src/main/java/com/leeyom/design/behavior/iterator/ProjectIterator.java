package com.leeyom.design.behavior.iterator;

import java.util.List;

/**
 * 项目迭代器实现
 */
public class ProjectIterator implements IProjectIterator {

    /**
     * 项目列表
     */
    private List<IProject> projectList;
    private int currentItem;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    public boolean hasNext() {
        boolean b = true;
        // 判断当前元素是否最后一个
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    public void remove() {

    }
}
