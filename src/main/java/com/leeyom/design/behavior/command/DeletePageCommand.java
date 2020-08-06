package com.leeyom.design.behavior.command;

/**
 * 删除页面命令
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        // 找到页面组
        super.pg.find();
        // 删除一个页面
        super.pg.delete();
    }
}
