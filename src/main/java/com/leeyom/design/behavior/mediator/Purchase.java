package com.leeyom.design.behavior.mediator;

import cn.hutool.core.lang.Console;

/**
 * 采购管理
 */
public class Purchase extends AbstractColleage {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 采购电脑
     *
     * @param number 采购数量
     */
    public void buyComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    /**
     * 不再采购电脑
     */
    public void refuseBuyComputer() {
        Console.log("不再采购电脑");
    }
}
