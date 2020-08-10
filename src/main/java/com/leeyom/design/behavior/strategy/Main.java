package com.leeyom.design.behavior.strategy;

import java.util.Arrays;

public class Main {

    // 加符号￼ 
    public final static String ADD_SYMBOL = "+";
    // 减符号￼ 
    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        // 参数a 
        int a = 4;
        // 符号￼ 
        String symbol = "+";
        // 参数b
        int b = 3;
        System.out.println("输入的参数为：" + Arrays.toString(args));
        // 上下文￼ 
        Context context = null;
        // 判断初始化哪一个策略￼ 
        if (symbol.equals(ADD_SYMBOL)) {
            context = new Context(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new Context(new Sub());
        }
        System.out.println("运行结果为：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }
}


