package com.leeyom.design.behavior.command;

import cn.hutool.core.lang.Console;

/**
 * 前端组
 */
public class PageGroup extends Group {

    @Override
    public void find() {
        Console.log("客户找到前端组...");
    }

    @Override
    public void add() {
        Console.log("客户要求增加一个页面...");
    }

    @Override
    public void delete() {
        Console.log("客户要求删除一个页面...");
    }

    @Override
    public void change() {
        Console.log("客户要求修改一个页面...");
    }

    @Override
    public void plan() {
        Console.log("客户要求前端组变更计划...");
    }

    @Override
    public void rollBack() {
        Console.log("回滚刚刚的命令...");
    }
}
