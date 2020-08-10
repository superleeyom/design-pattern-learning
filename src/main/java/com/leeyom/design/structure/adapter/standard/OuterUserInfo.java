package com.leeyom.design.structure.adapter.standard;

import java.util.Map;

/**
 * 适配器
 * 将外部员工信息转为内部员工信息
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    /**
     * 外部员工的基本信息
     */
    private Map baseInfo = super.getUserBaseInfo();
    /**
     * 外部员工的家庭信息
     */
    private Map homeInfo = super.getUserHomeInfo();
    /**
     * 外部员工的工作信息
     */
    private Map officeInfo = super.getUserOfficeInfo();

    /**
     * 家庭地址
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /**
     * 家庭电话号码
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    /**
     * 职位信息
     */
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /**
     * 手机号码
     */
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /**
     * 办公电话
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /**
     * 员工的名称
     */
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }
}
