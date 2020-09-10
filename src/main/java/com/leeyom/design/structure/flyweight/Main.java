package com.leeyom.design.structure.flyweight;

import cn.hutool.json.JSONUtil;

/**
 * 场景类
 *
 * @author leeyom wang
 * @date 2020/9/10 6:16 下午
 */
public class Main {

    public static void main(String[] args) {
        // 初始化对象池
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            // 初始化地址
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
        System.out.println(JSONUtil.toJsonStr(signInfo));
    }

}
