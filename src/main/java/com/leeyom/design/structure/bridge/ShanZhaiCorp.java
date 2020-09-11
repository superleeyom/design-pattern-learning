package com.leeyom.design.structure.bridge;

/**
 * 山寨公司，啥都生产
 *
 * @author leeyom wang
 * @date 2020/9/11 11:54 上午
 */
public class ShanZhaiCorp extends Corp {

    /**
     * 山寨公司啥东西都山寨，都生产
     *
     * @param product 山寨产品
     */
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
    }

}
