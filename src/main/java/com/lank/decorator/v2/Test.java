package com.lank.decorator.v2;

/**
 * @author lank
 * @since 2021/7/25 15:12
 */
public class Test {
    public static void main(String[] args) {
        AbstractBattercake abstractBattercake = new Battercake();

        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new SausageDecorator(abstractBattercake);
        System.out.println(abstractBattercake.getDesc()+" 销售价格:"+abstractBattercake.cost());

    }
}
