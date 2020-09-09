package com.leeyom.design.behavior.state;

/**
 * 电梯状态：运行
 *
 * @author leeyom wang
 * @date 2020/9/7 2:26 下午
 */
public class RunningState extends LiftState {

    @Override
    public void open() {
        System.out.println("运行的时候，电梯门不可能打开");
    }

    @Override
    public void close() {
        System.out.println("运行的时候，电梯门已是关闭状态");
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行。。。");
    }

    @Override
    public void stop() {
        // 电梯停止
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
