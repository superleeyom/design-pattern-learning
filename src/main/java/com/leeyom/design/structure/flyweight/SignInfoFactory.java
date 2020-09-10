package com.leeyom.design.structure.flyweight;

import java.util.HashMap;

/**
 * 对象工厂
 *
 * @author leeyom wang
 * @date 2020/9/10 6:12 下午
 */
public class SignInfoFactory {

    /**
     * 容器池
     */
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    /**
     * 获取对象
     *
     * @param key key
     * @return 对象
     */
    public static SignInfo getSignInfo(String key) {
        SignInfo signInfo = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "-------------建立对象，放到对象池中");
            signInfo = new SignInfo4Pool(key);
            pool.put(key, signInfo);
        } else {
            signInfo = pool.get(key);
            System.out.println(key + "-------------直接从对象池中获取");
        }
        return signInfo;
    }

}
