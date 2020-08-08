package com.leeyom.design.structure.decorator;

/**
 * 装饰器
 */
public abstract class Decorator extends SchoolReport {

    /**
     * 需要装饰的对象
     */
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        schoolReport.report();
    }

    @Override
    public void sign(String name) {
        schoolReport.sign(name);
    }
}
