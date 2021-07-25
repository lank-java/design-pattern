package com.lank.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lank
 * @since 2021/7/21 22:45
 */
@Data
@AllArgsConstructor
public class CglibDynamicProxy implements MethodInterceptor {

    private Object target;

    public Object bind() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        long startTimestamp = System.currentTimeMillis();
        System.out.println("startTime:"+startTimestamp);
        // ... 省略login逻辑...
        System.out.println(method.getName());
        String methodName = methodProxy.getSuperName();
        Object result = methodProxy.invokeSuper(o, objects);

        long endTimeStamp = System.currentTimeMillis();
        System.out.println("endTime:"+endTimeStamp);
        long responseTime = endTimeStamp - startTimestamp;
        System.out.println("【cglib动态代理记录】"+methodName + "方法执行时间:" + responseTime);
        return result;
    }
}
