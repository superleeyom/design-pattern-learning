package com.leeyom.design.behavior.observer.simple;

/**
 * 具体的观察者：李斯
 */
public class LiSi implements Observer {

    /**
     * 对接收到的消息进行处理
     *
     * @param context 通知消息
     */
    public void update(String context) {
        System.out.println("李斯观察到韩非子活动，就开始像老板汇报...");
        reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕！");
    }

    private void reportToQinShiHuang(String context) {
        System.out.println("李斯：报告皇上，韩非子有活动了：" + context);
    }
}
