package com.leeyom.design.behavior.mediator;

import cn.hutool.core.lang.Console;

/**
 * 中介者
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            //采购电脑￼ 
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            //销售电脑￼ 
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            //折价销售￼ 
            this.offSell();
        } else if (str.equals("stock.clear")) {
            //清仓处理￼ 
            this.clearStock();
        }
    }

    /**
     * 采购电脑
     *
     * @param number 采购数量
     */
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        // 销售状态大于80，销售状态良好，全量采购，否则折半采购
        if (saleStatus > 80) {
            Console.log("采购电脑" + number + "台");
            // 库存增加
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            Console.log("采购电脑" + buyNumber + "台");
            // 库存增加
            super.stock.increase(buyNumber);
        }
    }

    /**
     * 销售电脑
     *
     * @param number 销售数量
     */
    private void sellComputer(int number) {
        // 若库存不够，则购买电脑
        if (super.stock.getStockNum() < number) {
            super.purchase.buyComputer(number);
        }
        // 库存减少
        super.stock.decrease(number);
    }

    /**
     * 折价销售电脑
     */
    private void offSell() {
        Console.log("折价销售电脑" + super.stock.getStockNum() + "台");
    }

    /**
     * 清仓处理
     */
    private void clearStock() {
        // 要求清仓销售
        super.sale.offSale();
        // 采购人员不要采购了
        super.purchase.refuseBuyComputer();
    }

}
