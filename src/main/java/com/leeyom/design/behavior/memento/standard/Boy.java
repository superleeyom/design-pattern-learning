package com.leeyom.design.behavior.memento.standard;

import lombok.Data;

/**
 * 男孩：负责创建和恢复备忘录数据
 *
 * @author leeyom
 */
@Data
public class Boy {

    /**
     * 状态
     */
    private String state;

    /**
     * 创建备忘录
     *
     * @return 备忘录
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复备忘录
     *
     * @param memento 备忘录
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    /**
     * 更改状态
     */
    public void changeState() {
        this.state = "心情不太好";
    }

}
