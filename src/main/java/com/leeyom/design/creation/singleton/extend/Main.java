package com.leeyom.design.creation.singleton.extend;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // 随机抽取一个皇帝
            Emperor emperor = Emperor.getInstance();
            // 皇帝开始说话啦
            emperor.say();
        }
    }

}
