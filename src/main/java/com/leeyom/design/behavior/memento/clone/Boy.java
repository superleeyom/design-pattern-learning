package com.leeyom.design.behavior.memento.clone;

import lombok.Data;

/**
 * 男孩：负责创建和恢复备忘录数据
 * 通过clone方式去创建副本
 *
 * @author leeyom
 */
@Data
public class Boy implements Cloneable {

    /**
     * 男孩的备份
     */
    private Boy backup;

    /**
     * 状态
     */
    private String state;

    /**
     * 创建备忘录
     */
    public void createMemento() {
        this.backup = this.clone();
    }

    /**
     * 恢复备忘录
     */
    public void restoreMemento() {
        this.state = this.backup.getState();
    }

    /**
     * 更改状态
     */
    public void changeState() {
        this.state = "心情不太好";
    }

    /**
     * 克隆副本
     *
     * @return 副本
     */
    @Override
    protected Boy clone() {
        try {
            return (Boy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
