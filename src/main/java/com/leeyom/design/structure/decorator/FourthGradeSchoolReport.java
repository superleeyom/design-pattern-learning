package com.leeyom.design.structure.decorator;

import cn.hutool.core.lang.Console;

/**
 * 四年级成绩报告，本示例中，这个就是被装饰类
 */
public class FourthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {
        Console.log("尊敬的XXX家长:");
        Console.log("  ......");
        Console.log("  语文 62  数学65 体育 98  自然  63");
        Console.log("  .......");
        Console.log("               家长签名：       ");
    }

    @Override
    public void sign(String name) {
        Console.log("家长签名为：" + name);
    }
}
