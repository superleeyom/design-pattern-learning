package com.leeyom.design.structure.adapter.standard;

import java.util.Map;

/**
 * 外部员工信息
 */
public interface IOuterUser {
    /**
     * 基本信息，比如名称、性别、手机号码等
     */
    Map getUserBaseInfo();

    /**
     * 工作区域信息
     *
     * @return
     */
    Map getUserOfficeInfo();

    /**
     * 用户的家庭信息
     *
     * @return
     */
    Map getUserHomeInfo();
}
