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
     * 为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
     */
    final public void run() {
        // 发动机启用
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 控制喇叭，想让它响就响
        if (isAlarm()) {
            this.alarm();
        }
        // 汽车停止
        this.stop();
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
