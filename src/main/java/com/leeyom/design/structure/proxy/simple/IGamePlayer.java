package com.leeyom.design.structure.proxy.simple;

/**
 * 游戏者接口
 */
public interface IGamePlayer {

    /**
     * 登录游戏
     *
     * @param user     用户名
     * @param password 密码
     */
    void login(String user, String password);

    /**
     * 杀怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();

}