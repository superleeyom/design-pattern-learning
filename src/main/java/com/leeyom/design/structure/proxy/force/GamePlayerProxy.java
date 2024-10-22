package com.leeyom.design.structure.proxy.force;


import cn.hutool.core.lang.Console;

/**
 * 游戏代理者
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {


    private IGamePlayer gamePlayer = null;

    /**
     * 传入被代理者
     *
     * @param gamePlayer 被代理者
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
        // 升级完了后，结算费用
        count();
    }

    /**
     * 代理的代理类就是他自己了
     *
     * @return 代理者
     */
    public IGamePlayer getProxy() {
        return this;
    }

    public void count() {
        Console.log("升级费用：150元");
    }
}
