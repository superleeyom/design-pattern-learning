package com.leeyom.design.behavior.state;

/**
 * 电梯状态：停止
 *
 * @author leeyom wang
 * @date 2020/9/7 2:27 下午
 */
public class StoppingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        // 电梯停止后，打开电梯
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("停止状态，电梯门本来就是关的，不需要操作");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        // 电梯停止后，启动电梯
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("停止电梯。。。");
    }
}
