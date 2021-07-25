package com.lank.decorator.v1;

/**
 * @author lank
 * @since 2021/7/25 15:12
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 消费价格:"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 消费价格:"+battercakeWithEgg.cost());

        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getDesc()+" 消费价格:"+battercakeWithEggAndSausage.cost());

    }
}
