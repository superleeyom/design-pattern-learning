package com.leeyom.design.behavior.memento.standard;

public class Main {

    public static void main(String[] args) {

        // 声明男孩和备忘录管理者
        Boy boy = new Boy();
        CareTaker careTaker = new CareTaker();

        // 记录当前男孩的状态
        boy.setState("心情很棒");
        System.out.println("男孩当前的状态：" + boy.getState());
        careTaker.setMemento(boy.createMemento());

        // 男孩追女孩失败
        boy.changeState();
        System.out.println("男孩子追女孩失败后的状态：" + boy.getState());

        // 男孩重新恢复信心
        boy.restoreMemento(careTaker.getMemento());
        System.out.println("男孩子重新恢复信心后状态：" + boy.getState());

    }

}
