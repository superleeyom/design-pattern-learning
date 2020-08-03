package com.leeyom.design.behavior.template;

import cn.hutool.core.lang.Console;

public class Main {

    public static void main(String[] args) {

        // H1悍马
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.setAlarmFlag(true);
        hummerH1Model.run();

        Console.log("========================================");

        // H2悍马
        HummerH2Model hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }

}
