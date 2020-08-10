package com.leeyom.design.structure.adapter.extend;

public class Main {

    public static void main(String[] args) {

        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        // 外部员工信息
        OuterUserInfo outerUserInfo = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        outerUserInfo.getUserName();
        outerUserInfo.getHomeAddress();
        outerUserInfo.getHomeTelNumber();
        outerUserInfo.getMobileNumber();
        outerUserInfo.getJobPosition();
        outerUserInfo.getOfficeTelNumber();

    }

}
