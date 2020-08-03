package com.leeyom.design.behavior.template;

/**
 * 抽象悍马模型
 */
public abstract class HummerModel {

    /**
     * 发动机启动
     */
    protected abstract void start();

    /**
     * 发动机停止
     */
    protected abstract void stop();

    /**
     * 喇叭发声
     */
    protected abstract void alarm();

    /**
     * 引擎轰鸣
     */
    protected abstract void engineBoom();

    /**
     * 汽车开始跑起来了
     */
    public void run() {
        // 发动机启用
        start();
        // 引擎开始轰鸣
        engineBoom();
        // 控制喇叭，想让它响就响
        if (isAlarm()) {
            alarm();
        }
        // 汽车停止
        stop();
    }

    /**
     * 钩子方法，默认喇叭是会响，用于控制喇叭声响
     *
     * @return true
     */
    protected boolean isAlarm() {
        return true;
    }

}
