package com.leeyom.design.behavior.state;

/**
 * 电梯状态：关闭
 *
 * @author leeyom wang
 * @date 2020/9/7 2:25 下午
 */
public class ClosingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        // 电梯关闭后，打开电梯
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭。。。");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        // 电梯关闭后，启动电梯
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        // 停止电梯
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
