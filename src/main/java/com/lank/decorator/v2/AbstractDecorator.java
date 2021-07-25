package com.lank.decorator.v2;

/**
 * @author lank
 * @since 2021/7/25 14:44
 */
public class AbstractDecorator extends AbstractBattercake{
    private final AbstractBattercake abstractBattercake;

    public AbstractDecorator(AbstractBattercake abstractBattercake) {
        this.abstractBattercake = abstractBattercake;
    }

    @Override
    public String getDesc() {
        return abstractBattercake.getDesc();
    }

    @Override
    public int cost() {
        return abstractBattercake.cost();
    }
}
