package com.leeyom.design.structure.proxy.force;

import cn.hutool.core.lang.Console;

public class Main {

    public static void main(String[] args) {

        // 直接访问真实的角色
        IGamePlayer gamePlayer = new GamePlayer("张三");
        gamePlayer.login("zhangsan", "123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

        Console.log("************************************");

        // 直接访问代理类
        IGamePlayer gamePlayer1 = new GamePlayer("张三");
        IGamePlayer proxy1 = new GamePlayerProxy(gamePlayer1);
        proxy1.login("zhangsan", "123456");
        proxy1.killBoss();
        proxy1.upgrade();

        Console.log("================================");

        // 强制代理类访问
        IGamePlayer gamePlayer2 = new GamePlayer("张三");
        IGamePlayer proxy2 = gamePlayer2.getProxy();
        proxy2.login("zhangsan", "123456");
        proxy2.killBoss();
        proxy2.upgrade();
    }

}
