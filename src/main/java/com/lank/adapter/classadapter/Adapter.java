package com.lank.adapter.classadapter;

/**
 * @author lank
 * @since 2021/7/25 23:44
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        // ...可以增加逻辑代码
        super.adapterRequest();
        // ...可以增加逻辑代码
    }
}
