package com.leeyom.design.behavior.command;

/**
 * 命令抽象
 */
public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    /**
     * 执行命令
     */
    public abstract void execute();

}
