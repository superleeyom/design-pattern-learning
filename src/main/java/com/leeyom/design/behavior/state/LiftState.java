package com.leeyom.design.behavior.state;

/**
 * 电梯状态抽象类
 *
 * @author leeyom wang
 * @date 2020/9/7 2:13 下午
 */
public abstract class LiftState {

    Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯门打开
     */
    public abstract void open();

    /**
     * 电梯门关闭
     */
    public abstract void close();

    /**
     * 电梯运行
     */
    public abstract void run();

    /**
     * 电梯停止
     */
    public abstract void stop();

}
