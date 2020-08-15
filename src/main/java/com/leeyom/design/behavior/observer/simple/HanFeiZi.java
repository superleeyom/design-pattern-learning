package com.leeyom.design.behavior.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者：韩非子
 */
public class HanFeiZi implements IHanFeiZi, Observable {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void haveBreakfast() {
        System.out.println("韩非子开始吃午饭...");
        // 通知观察者
        notifyObservers("韩非子吃饭了");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐...");
        // 通知观察者
        notifyObservers("韩非子娱乐了");
    }

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }
}
