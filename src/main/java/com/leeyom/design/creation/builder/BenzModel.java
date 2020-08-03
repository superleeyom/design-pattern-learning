package com.leeyom.design.creation.builder;

import cn.hutool.core.lang.Console;

/**
 * 奔驰模型
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {
        Console.log("奔驰车跑起来是这个样子...");
    }

    @Override
    protected void stop() {
        Console.log("奔驰车停车了...");
    }

    @Override
    protected void alarm() {
        Console.log("奔驰车喇叭响了...");
    }

    @Override
    protected void engineBoom() {
        Console.log("奔驰车引擎轰鸣...");
    }
}
