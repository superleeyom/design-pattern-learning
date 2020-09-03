package com.leeyom.design.behavior.memento.standard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录：记录当前用户的状态数据
 *
 * @author leeyom
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Memento {

    /**
     * 状态
     */
    private String state;


}
