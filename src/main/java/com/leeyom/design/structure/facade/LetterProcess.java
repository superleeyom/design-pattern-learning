package com.leeyom.design.structure.facade;

/**
 * 写信接口实现
 */
public class LetterProcess implements ILetterProcess {

    public void writeContext(String context) {
        System.out.println("开始写信，信的内容为：" + context);
    }

    public void fillEnvelope(String address) {
        System.out.println("填写信封的地址：" + address);
    }

    public void letterIntoEnvelope() {
        System.out.println("将信装入信封");
    }

    public void sendLetter() {
        System.out.println("开始投递信件");
    }
}
