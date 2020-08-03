package com.leeyom.design.behavior.template;

import cn.hutool.core.lang.Console;

/**
 * H1悍马
 */
public class HummerH1Model extends HummerModel {

    /**
     * 默认喇叭响
     */
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        Console.log("悍马H1发动...");
    }

    @Override
    protected void stop() {
        Console.log("悍马H1停止...");
    }

    @Override
    protected void alarm() {
        Console.log("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        Console.log("悍马H1引擎轰鸣中...");
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    /**
     * 要不要响喇叭，由客户自己决定
     *
     * @param alarmFlag true or false
     */
    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
