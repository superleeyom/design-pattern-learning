package com.leeyom.design.behavior.chain;

import cn.hutool.core.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 创建妇女
        List<IWomen> womenList = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++) {
            int type = RandomUtil.randomInt(1,4);
            System.out.println(type);
            womenList.add(new Woman(type, "我要去逛街"));
        }

        // 设置责任链
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);

        // 开始执行
        for (IWomen women : womenList) {
            father.handleMessage(women);
        }
    }

}
