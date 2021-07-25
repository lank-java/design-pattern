package com.lank.decorator.v2;

/**
 * @author lank
 * @since 2021/7/25 15:02
 */
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
