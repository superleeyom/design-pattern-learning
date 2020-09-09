package com.leeyom.design.behavior.state;

/**
 * client
 *
 * @author leeyom wang
 * @date 2020/9/7 2:29 下午
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.OPENING_STATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }

}
