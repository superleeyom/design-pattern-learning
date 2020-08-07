package com.leeyom.design.behavior.chain;

/**
 * 妇女的具体实现
 */
public class Woman implements IWomen {

    /**
     * 妇女的状况
     * 1未出嫁，2出嫁，3丧夫
     */
    private int type = 0;

    /**
     * 妇女的请求
     */
    private String request = "";

    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}
