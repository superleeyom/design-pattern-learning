package com.leeyom.design.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝
 */
public class Thing2 implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected Thing2 clone() {
        Thing2 thing2 = null;
        try {
            thing2 = (Thing2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing2;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public List<String> getValue() {
        return this.arrayList;
    }

}
