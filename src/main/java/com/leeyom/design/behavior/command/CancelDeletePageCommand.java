package com.leeyom.design.behavior.command;

/**
 * 撤销删除页面命令
 */
public class CancelDeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pg.rollBack();
    }
}
