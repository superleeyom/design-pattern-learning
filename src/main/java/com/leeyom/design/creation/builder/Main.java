package com.leeyom.design.creation.builder;

import cn.hutool.core.lang.Console;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzModel().run();
        Console.log("========================================");
        director.getBBenzModel().run();
    }

}
