package com.leeyom.design.behavior.command;

public class Main {

    public static void main(String[] args) {
        // 客户发出新增需求命令
        AddRequirementCommand addRequirementCommand = new AddRequirementCommand();
        // 客户找到负责人
        Invoker invoker = new Invoker();
        // 负责人传达命令
        invoker.setCommand(addRequirementCommand);
        // 负责人执行命令
        invoker.action();

        DeletePageCommand deletePageCommand = new DeletePageCommand();
        invoker.setCommand(deletePageCommand);
        invoker.action();

        CancelDeletePageCommand cancelDeletePageCommand = new CancelDeletePageCommand();
        invoker.setCommand(cancelDeletePageCommand);
        invoker.action();

    }
}
