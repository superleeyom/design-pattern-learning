package com.leeyom.design.structure.adapter.extend;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    /**
     * 员工的工作信息，比如，职位等
     */
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap(2);
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
