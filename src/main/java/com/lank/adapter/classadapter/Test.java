package com.lank.adapter.classadapter;

/**
 * @author lank
 * @since 2021/7/25 23:46
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }


}
