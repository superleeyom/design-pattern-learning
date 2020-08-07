package com.leeyom.design.behavior.chain;

/**
 * 妇女抽象
 */
public interface IWomen {

    /**
     * 获取妇女个人状态
     *
     * @return 1未出嫁，2出嫁，3丧夫
     */
    int getType();

    /**
     * 获取妇女的请求
     *
     * @return 请求
     */
    String getRequest();

}
