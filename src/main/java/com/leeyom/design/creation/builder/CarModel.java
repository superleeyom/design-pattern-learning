package com.leeyom.design.creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 车辆模型抽象
 */
public abstract class CarModel {
    /**
     * 汽车执行顺序
     */
    private List<String> sequence = new ArrayList<String>();

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 喇叭叫
     */
    protected abstract void alarm();

    /**
     * 引擎轰鸣
     */
    protected abstract void engineBoom();

    /**
     * 汽车开始跑起来
     */
    final public void run() {
        // 循环一遍，谁在前，就先执行谁
        for (String actionName : this.sequence) {
            if (actionName.equalsIgnoreCase("start")) {
                // 启动汽车
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                // 停止汽车
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                // 喇叭开始叫了
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                // 引擎开始轰鸣
                this.engineBoom();
            }
        }
    }

    /**
     * 设置汽车启动顺序
     *
     * @param sequence 启动顺序
     */
    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
