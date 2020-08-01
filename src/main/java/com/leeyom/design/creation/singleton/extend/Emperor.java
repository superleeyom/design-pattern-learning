package com.leeyom.design.creation.singleton.extend;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 单例模式扩展，如果一个类可以产生多个对象，对象的数量不受限制，则是非常容易实现的，
 * 直接使用new关键字就可以了，如果只需要一个对象，使用单例模式就可以了，但是如果要求一个类只能产生两三个对象呢？
 * 以下就是一个皇帝示例，生成两个皇帝，随机朝拜其中一个皇帝
 *
 * @author leeyom
 */
@Slf4j
public class Emperor {

    /**
     * 最多允许产生两个皇帝
     */
    private static int maxNumEmperor = 2;

    /**
     * 每个皇帝都有名字，用一个集合收集
     */
    private static List<String> emperorNameList = CollUtil.newArrayList();

    /**
     * 皇帝实例列表，用集合收集
     */
    private static List<Emperor> emperorList = CollUtil.newArrayList();

    /**
     * 当前皇帝序号
     */
    private static int currentNumEmperor = 0;

    // 初始化两个皇帝
    static {
        for (int i = 0; i < maxNumEmperor; i++) {
            emperorList.add(new Emperor("皇帝" + i));
        }
    }

    /**
     * 私有化构造器，传入皇帝的名字，并收集起来
     *
     * @param emperorName 皇帝的名字
     */
    private Emperor(String emperorName) {
        emperorNameList.add(emperorName);
    }

    /**
     * 从两个皇帝中，随机获取一个皇帝
     *
     * @return 皇帝实例
     */
    public static Emperor getInstance() {
        currentNumEmperor = RandomUtil.randomInt(maxNumEmperor);
        return emperorList.get(currentNumEmperor);
    }

    /**
     * 皇帝发话了
     */
    public void say() {
        log.info(emperorNameList.get(currentNumEmperor) + "开始说话...");
    }


}
