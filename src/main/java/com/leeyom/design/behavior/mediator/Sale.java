package com.leeyom.design.behavior.mediator;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.RandomUtil;

/**
 * 销售管理
 */
public class Sale extends AbstractColleage {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 获取销售状态
     *
     * @return
     */
    public int getSaleStatus() {
        int saleStatus = RandomUtil.randomInt(100);
        Console.log("销售情况：" + saleStatus);
        return saleStatus;
    }

    /**
     * 销售电脑
     *
     * @param number
     */
    public void sellComputer(int number) {
        Console.log("销售电脑" + number + "台");
        super.mediator.execute("sale.sell", number);
    }

    /**
     * 折价处理
     */
    public void offSale() {
        super.mediator.execute("sale.offsell");
    }
}
