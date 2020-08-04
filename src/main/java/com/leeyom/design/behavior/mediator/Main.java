package com.leeyom.design.behavior.mediator;

public class Main {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        // 采购人员采购电脑
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);

        // 销售人员销售电脑
        Sale sale = new Sale(mediator);
        sale.sellComputer(1);

        // 库房人员管理库存
        Stock stock = new Stock(mediator);
        stock.clearStock();

    }

}
