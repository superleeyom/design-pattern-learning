package com.leeyom.design.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 深拷贝
 */
public class Thing3 implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected Thing3 clone() {
        Thing3 thing3 = null;
        try {
            thing3 = (Thing3) super.clone();
            // 对私有的类变量也进行拷贝
            thing3.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing3;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public List<String> getValue() {
        return this.arrayList;
    }

}
