package com.leeyom.design.creation.builder;

import java.util.List;

/**
 * 汽车组装者抽象
 */
public abstract class CarBuilder {

    /**
     * 设置启动顺序
     *
     * @param sequence 启动顺序
     */
    public abstract void setSequence(List<String> sequence);

    /**
     * 获取车辆模型
     *
     * @return 车辆模型
     */
    public abstract CarModel getCarModel();
}
