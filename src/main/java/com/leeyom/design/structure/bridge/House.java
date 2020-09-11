package com.leeyom.design.structure.bridge;

/**
 * 房子
 *
 * @author leeyom wang
 * @date 2020/9/11 11:51 上午
 */
public class House extends Product {


    @Override
    public void beProduced() {
        System.out.println("开始生产房子。。。");
    }

    @Override
    public void beSold() {
        System.out.println("房子被销售出去了。。。");
    }
}
