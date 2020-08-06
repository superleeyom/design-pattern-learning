package com.leeyom.design.behavior.command;

import cn.hutool.core.lang.Console;

/**
 * 编码组
 */
public class CodeGroup extends Group {


    @Override
    public void find() {
        Console.log("客户找到编码组...");
    }

    @Override
    public void add() {
        Console.log("客户要求增加一个功能...");
    }

    @Override
    public void delete() {
        Console.log("客户要求删除一个功能...");
    }

    @Override
    public void change() {
        Console.log("客户要求变更一个功能...");
    }

    @Override
    public void plan() {
        Console.log("客户要求代码组变更计划...");
    }
}
