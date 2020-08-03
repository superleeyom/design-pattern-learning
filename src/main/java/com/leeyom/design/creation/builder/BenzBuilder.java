package com.leeyom.design.creation.builder;

import java.util.List;

/**
 * 奔驰车组装
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
