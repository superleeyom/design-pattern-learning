package com.leeyom.design.behavior.state;

/**
 * 电梯状态：开启
 *
 * @author leeyom wang
 * @date 2020/9/7 2:24 下午
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("打开电梯。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        // 关闭电梯
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        System.out.println("电梯门打开的时候，不能启动");
    }

    @Override
    public void stop() {
        System.out.println("门是打开状态，自然也就是停止状态了");
    }
}
