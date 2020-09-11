package com.leeyom.design.structure.bridge;

/**
 * 产品
 *
 * @author leeyom wang
 * @date 2020/9/11 11:44 上午
 */
public abstract class Product {

    /**
     * 产品被生产出来
     */
    public abstract void beProduced();

    /**
     * 产品被销售出去
     */
    public abstract void beSold();

}
