package com.lank.adapter.objectadapter;

/**
 * @author lank
 * @since 2021/7/25 23:42
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
