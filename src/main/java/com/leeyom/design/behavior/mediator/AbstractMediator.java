package com.leeyom.design.behavior.mediator;

/**
 * 抽象中介者
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    /**
     * 事件方法，处理多对象之间的关系
     *
     * @param str
     * @param objects
     */
    public abstract void execute(String str, Object... objects);
}
