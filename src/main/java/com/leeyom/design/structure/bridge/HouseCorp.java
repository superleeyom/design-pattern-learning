package com.leeyom.design.structure.bridge;

/**
 * 房地产公司
 *
 * @author leeyom wang
 * @date 2020/9/11 11:50 上午
 */
public class HouseCorp extends Corp {

    /**
     * 房地产公司只生产房子
     *
     * @param house 房子
     */
    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
    }

}
