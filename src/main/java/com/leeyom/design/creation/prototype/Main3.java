package com.leeyom.design.creation.prototype;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONUtil;

public class Main3 {

    public static void main(String[] args) {
        Thing3 thing3 = new Thing3();
        thing3.setValue("张三");
        Thing3 cloneThing3 = thing3.clone();
        cloneThing3.setValue("李四");
        // 打印结果为：["张三"]，私有的类变量进行独立的拷贝
        Console.log(JSONUtil.toJsonStr(thing3.getValue()));
    }

}
