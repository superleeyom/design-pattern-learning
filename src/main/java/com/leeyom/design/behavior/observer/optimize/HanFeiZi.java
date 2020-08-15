package com.leeyom.design.behavior.observer.optimize;

import com.leeyom.design.behavior.observer.simple.IHanFeiZi;

import java.util.Observable;

/**
 * 被观察者：韩非子
 */
public class HanFeiZi extends Observable implements IHanFeiZi {


    public void haveBreakfast() {
        System.out.println("韩非子开始吃午饭...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
