package com.leeyom.design.structure.facade;

/**
 * 写信接口
 */
public interface ILetterProcess {

    /**
     * 写信
     *
     * @param context 信的内容
     */
    void writeContext(String context);

    /**
     * 填写信封
     *
     * @param address 地址
     */
    void fillEnvelope(String address);

    /**
     * 将信装入信封
     */
    void letterIntoEnvelope();

    /**
     * 邮递信件
     */
    void sendLetter();

}
