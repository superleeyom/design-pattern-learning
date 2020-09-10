package com.leeyom.design.structure.flyweight;

import lombok.Data;

/**
 * 报考信息
 *
 * @author leeyom wang
 * @date 2020/9/10 6:08 下午
 */
@Data
public class SignInfo {

    /**
     * 报考人员id
     */
    private String id;

    /**
     * 考试地点
     */
    private String location;

    /**
     * 考试科目
     */
    private String subject;

    /**
     * 邮寄地址
     */
    private String postAddress;


}
