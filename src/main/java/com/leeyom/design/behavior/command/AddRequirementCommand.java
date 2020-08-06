package com.leeyom.design.behavior.command;

/**
 * 新增需求命令
 */
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        // 找到需求组
        super.rg.find();
        // 新增一个需求
        super.rg.add();
    }
}
