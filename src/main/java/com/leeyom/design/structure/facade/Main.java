package com.leeyom.design.structure.facade;

public class Main {

    public static void main(String[] args) {
        ModenPostOffice postOffice = new ModenPostOffice();
        String context = "嗨，我是王二狗，你最近过得还好吗？...";
        String address = "广东省深圳市南山区崇文区八号楼";
        postOffice.sendLetter(context, address);
    }

}
