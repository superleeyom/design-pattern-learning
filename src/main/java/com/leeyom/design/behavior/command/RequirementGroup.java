package com.leeyom.design.behavior.command;

import cn.hutool.core.lang.Console;

/**
 * 需求组
 */
public class RequirementGroup extends Group{


    @Override
    public void find() {
        Console.log("客户找到需求组...");
    }

    @Override
    public void add() {
        Console.log("客户要求增加一个需求...");
    }

    @Override
    public void delete() {
        Console.log("客户要求删除一个需求...");
    }

    @Override
    public void change() {
        Console.log("客户要求变更一个需求...");
    }

    @Override
    public void plan() {
        Console.log("客户要求需求组变更计划...");
    }
}
