package com.leeyom.design.behavior.observer.simple;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 通知更新
     *
     * @param context 变更内容
     */
    void update(String context);

}
