package com.leeyom.design.structure.bridge;

/**
 * 公司
 *
 * @author leeyom wang
 * @date 2020/9/11 11:44 上午
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    /**
     * 公司挣钱
     */
    public void makeMoney() {
        // 步骤1：生产产品
        this.product.beProduced();
        // 步骤2：销售产品
        this.product.beSold();
    }
}
