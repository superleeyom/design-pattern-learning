package com.leeyom.design.structure.flyweight;

import lombok.Data;

/**
 * 对象池的报考信息
 *
 * @author leeyom wang
 * @date 2020/9/10 6:10 下午
 */
@Data
public class SignInfo4Pool extends SignInfo {

    /**
     * 定义一个对象池提取的key值
     */
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }
}
