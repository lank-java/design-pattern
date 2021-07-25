package com.lank.decorator.v2;

/**
 * @author lank
 * @since 2021/7/25 15:05
 *  煎饼类
 */
public class Battercake extends AbstractBattercake {

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
