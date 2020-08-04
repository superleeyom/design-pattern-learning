package com.leeyom.design.behavior.mediator;

/**
 * 抽象同事
 */
public abstract class AbstractColleage {

    protected AbstractMediator mediator;

    public AbstractColleage(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
