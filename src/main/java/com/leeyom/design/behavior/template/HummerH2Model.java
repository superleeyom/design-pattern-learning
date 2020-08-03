package com.leeyom.design.behavior.template;

import cn.hutool.core.lang.Console;

/**
 * H2悍马
 */
public class HummerH2Model extends HummerModel {

    @Override
    protected void start() {
        Console.log("悍马H2发动...");
    }

    @Override
    protected void stop() {
        Console.log("悍马H2停止...");
    }

    @Override
    protected void alarm() {
        Console.log("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        Console.log("悍马H2引擎轰鸣中...");
    }

    /**
     * 默认没有喇叭
     *
     * @return false
     */
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
