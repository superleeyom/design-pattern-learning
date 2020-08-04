package com.leeyom.design.creation.prototype;

public class Main {

    public static void main(String[] args) {
        // 生成一个对象，构造器执行
        Thing thing = new Thing();
        // 拷贝一个对象，原型模式下，构造函数不会执行
        Thing cloneThing = thing.clone();
    }

}
