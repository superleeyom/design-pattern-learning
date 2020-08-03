package com.leeyom.design.structure.proxy.simple;

import cn.hutool.core.lang.Console;

/**
 * 普通的游戏者
 */
public class GamePlayer implements IGamePlayer {

    /**
     * 游戏者姓名
     */
    private String name = "";

    public GamePlayer(IGamePlayer gamePlayer, String name) {
        // 构造函数中，传递进来一个IGamePlayer对象，检查谁能创建真实的角色，当然还可以有其他的限制，比如类名必须为Proxy类等
        if (gamePlayer == null) {
            throw new ProxyException("不能创建真实的角色！");
        }
        this.name = name;
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        Console.log("登录名为 " + user + " 的用户 " + this.name + " 登录成功");
    }

    public void killBoss() {
        Console.log(this.name + " 在打怪");
    }

    public void upgrade() {
        Console.log(this.name + " 又升了一级");
    }
}
