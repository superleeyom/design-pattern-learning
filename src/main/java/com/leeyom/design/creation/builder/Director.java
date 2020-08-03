package com.leeyom.design.creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 导演类，负责定制不同启动顺序的奔驰车
 */
public class Director {

    private List<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();

    /**
     * A类型的奔驰车模型，先start，然后stop，其他什么引擎、喇叭一概没有
     */
    public BenzModel getABenzModel() {
        // 清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        // ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    // ...

}
