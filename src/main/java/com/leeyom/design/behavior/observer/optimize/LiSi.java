package com.leeyom.design.behavior.observer.optimize;

import cn.hutool.core.util.ObjectUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者：李斯
 */
public class LiSi implements Observer {

    /**
     * 对接收到的消息进行处理
     *
     * @param o   被观察者
     * @param arg 通知消息
     */
    public void update(Observable o, Object arg) {
        System.out.println("李斯观察到韩非子活动，就开始像老板汇报...");
        reportToQinShiHuang(ObjectUtil.toString(arg));
        System.out.println("李斯：汇报完毕！");
    }

    private void reportToQinShiHuang(String context) {
        System.out.println("李斯：报告皇上，韩非子有活动了：" + context);
    }
}
