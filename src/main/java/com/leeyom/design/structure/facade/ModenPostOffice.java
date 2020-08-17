package com.leeyom.design.structure.facade;

/**
 * 邮局（门面对象）
 */
public class ModenPostOffice {


    private Context c = new Context();

    /**
     * 投递信件
     *
     * @param context 信的内容
     * @param address 收信地址
     */
    public void sendLetter(String context, String address) {
        c.sendLetter(context, address);
    }

}
