package com.leeyom.design.behavior.observer.optimize;

public class Main {

    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }

}
