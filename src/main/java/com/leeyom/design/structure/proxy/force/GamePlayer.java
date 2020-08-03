package com.leeyom.design.structure.proxy.force;

import cn.hutool.core.lang.Console;

/**
 * 普通的游戏者
 */
public class GamePlayer implements IGamePlayer {

    /**
     * 游戏者姓名
     */
    private String name = "";

    /**
     * 我的代理者是谁
     */
    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        if (this.isProxy()) {
            Console.log("登录名为 " + user + " 的用户 " + this.name + " 登录成功");
        } else {
            Console.error("请使用指定的代理访问");
        }
    }

    public void killBoss() {
        if (isProxy()) {
            Console.log(this.name + " 在打怪");
        } else {
            Console.error("请使用指定的代理访问");
        }
    }

    public void upgrade() {
        if (isProxy()) {
            Console.log(this.name + " 又升了一级");
        } else {
            Console.error("请使用指定的代理访问");
        }
    }

    /**
     * 获取我的代理者
     *
     * @return 代理者
     */
    public IGamePlayer getProxy() {
        return this.proxy = new GamePlayerProxy(this);
    }

    /**
     * 校验是否是代理访问
     *
     * @return true or false
     */
    private boolean isProxy() {
        return this.proxy != null;
    }
}
