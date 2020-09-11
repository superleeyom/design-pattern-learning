package com.leeyom.design.structure.bridge;

/**
 * 客户端
 *
 * @author leeyom wang
 * @date 2020/9/11 11:56 上午
 */
public class Main {

    public static void main(String[] args) {

        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();

    }

}
