package com.lank.adapter.objectadapter;

/**
 * @author lank
 * @since 2021/7/25 23:44
 */
public class Adapter implements Target {
    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // ...可以增加逻辑代码
        adaptee.adapterRequest();
        // ...可以增加逻辑代码
    }
}
