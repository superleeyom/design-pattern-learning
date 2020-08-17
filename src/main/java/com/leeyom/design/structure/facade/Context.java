package com.leeyom.design.structure.facade;

/**
 * 封装类，门面对象通过对它的访问完成一个复杂的业务逻辑
 */
public class Context {

    private ILetterProcess letterProcess = new LetterProcess();
    private Police police = new Police();

    /**
     * 投递信件
     *
     * @param context 信的内容
     * @param address 收信地址
     */
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        police.checkLetter(context);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }

}
