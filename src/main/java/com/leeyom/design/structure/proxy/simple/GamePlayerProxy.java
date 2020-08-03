package com.leeyom.design.structure.proxy.simple;

/**
 * 游戏代理者
 */
public class GamePlayerProxy implements IGamePlayer {


    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {
        gamePlayer = new GamePlayer(this, name);
    }

    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
