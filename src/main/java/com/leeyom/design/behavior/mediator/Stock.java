package com.leeyom.design.behavior.mediator;

import cn.hutool.core.lang.Console;

/**
 * 库存管理
 */
public class Stock extends AbstractColleage {

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 仓库初始电脑树为100台
     */
    private static int COMPUTER_NUMBER = 100;

    /**
     * 新增库存
     *
     * @param number
     */
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        Console.log("增加库存，库存数量为" + COMPUTER_NUMBER + "台");
    }

    /**
     * 减库存
     *
     * @param number
     */
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        Console.log("减掉库存，库存数量为" + COMPUTER_NUMBER + "台");
    }

    /**
     * 获取库存数量
     *
     * @return
     */
    public int getStockNum() {
        return COMPUTER_NUMBER;
    }

    /**
     * 清理库存
     */
    public void clearStock() {
        Console.log("清理库存，库存数量为" + COMPUTER_NUMBER + "台");
        super.mediator.execute("stock.clear");
    }
}
