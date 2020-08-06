package com.leeyom.design.behavior.command;

/**
 * 负责人
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户的命令
     */
    public void action() {
        this.command.execute();
    }
}
