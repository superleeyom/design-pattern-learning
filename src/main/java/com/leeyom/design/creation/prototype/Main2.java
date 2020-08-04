package com.leeyom.design.creation.prototype;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONUtil;

public class Main2 {

    public static void main(String[] args) {
        Thing2 thing2 = new Thing2();
        thing2.setValue("张三");
        Thing2 cloneThing2 = thing2.clone();
        cloneThing2.setValue("李四");
        // 打印结果为：["张三","李四"]
        // Java做了一个偷懒的拷贝动作，Object类提供的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，
        // 还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝。
        Console.log(JSONUtil.toJsonStr(thing2.getValue()));
    }

}
