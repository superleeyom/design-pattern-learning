package com.leeyom.design.structure.decorator;

public class Main {

    public static void main(String[] args) {
        SchoolReport report = new FourthGradeSchoolReport();
        // 装饰成绩
        report = new HighScoreDecorator(report);
        // 装饰排名
        report = new SortDecorator(report);
        // 报告成绩
        report.report();
        // 家长签名
        report.sign("老王");
    }

}
