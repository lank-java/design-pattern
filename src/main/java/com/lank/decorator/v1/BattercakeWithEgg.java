package com.lank.decorator.v1;

/**
 * @author lank
 * @since 2021/7/25 15:06
 * 加一个鸡蛋的煎饼
 */
public class BattercakeWithEgg extends Battercake{

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
