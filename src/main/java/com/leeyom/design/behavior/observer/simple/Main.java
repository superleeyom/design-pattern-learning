package com.leeyom.design.behavior.observer.simple;

public class Main {

    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        Observer lisi = new LiSi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }

}
