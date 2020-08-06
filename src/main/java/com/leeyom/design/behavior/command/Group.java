package com.leeyom.design.behavior.command;

/**
 * 小组抽象
 */
public abstract class Group {

    /**
     * 找到开发组
     */
    public abstract void find();

    /**
     * 增加功能
     */
    public abstract void add();

    /**
     * 删除功能
     */
    public abstract void delete();

    /**
     * 修改功能
     */
    public abstract void change();

    /**
     * 变更计划
     */
    public abstract void plan();

    /**
     * 回滚操作
     */
    public void rollBack() {

    }


}
