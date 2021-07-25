package com.lank.decorator.v1;

/**
 * @author lank
 * @since 2021/7/25 15:09
 * 加一个鸡蛋以及一个香肠
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
