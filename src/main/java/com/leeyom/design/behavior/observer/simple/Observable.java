package com.leeyom.design.behavior.observer.simple;

/**
 * 被观察者
 */
public interface Observable {

    /**
     * 新增观察者
     *
     * @param observer 观察者
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    void deleteObserver(Observer observer);

    /**
     * 通知观察者
     *
     * @param context 通知内容
     */
    void notifyObservers(String context);

}
