package com.leeyom.design.structure.adapter.standard;

import cn.hutool.core.lang.Console;

public class Main {

    public static void main(String[] args) {

        // 内部员工信息
        IUserInfo userInfo = new UserInfo();
        userInfo.getUserName();
        userInfo.getHomeAddress();
        userInfo.getHomeTelNumber();
        userInfo.getMobileNumber();
        userInfo.getJobPosition();
        userInfo.getOfficeTelNumber();

        Console.log("======================================================");

        // 外部员工信息
        IUserInfo outerUserInfo = new OuterUserInfo();
        outerUserInfo.getUserName();
        outerUserInfo.getHomeAddress();
        outerUserInfo.getHomeTelNumber();
        outerUserInfo.getMobileNumber();
        outerUserInfo.getJobPosition();
        outerUserInfo.getOfficeTelNumber();
    }

}
