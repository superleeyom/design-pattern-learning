package com.leeyom.design.behavior.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 客户端
 *
 * @author leeyom wang
 * @date 2020/9/9 10:28 下午
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        // 赋值
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
    }

    /**
     * 获得表达式
     *
     * @return 表达式
     */
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    /**
     * 获得值映射
     *
     * @param exprStr 表达式
     * @return 值映射
     */
    public static HashMap<String, Integer> getValue(String exprStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // 解析有几个参数要传递
        for (char ch : exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                // 解决重复参数的问题
                if (!map.containsKey(String.valueOf(ch))) {
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}


