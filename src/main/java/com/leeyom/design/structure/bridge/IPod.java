package com.leeyom.design.structure.bridge;

/**
 * iPod
 *
 * @author leeyom wang
 * @date 2020/9/11 11:52 上午
 */
public class IPod extends Product {

    @Override
    public void beProduced() {
        System.out.println("开始生产iPod。。。");
    }

    @Override
    public void beSold() {
        System.out.println("iPod被销售出去了。。。");
    }
}
