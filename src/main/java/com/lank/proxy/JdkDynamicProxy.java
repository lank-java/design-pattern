package com.lank.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lank
 * @since 2021/7/21 21:40
 * 方法执行时间动态代理类
 */
@AllArgsConstructor
@Data
public class JdkDynamicProxy implements InvocationHandler {

    /**
     * 被代理的类
     */
    private Object target;

    /**
     * 生成代理的方法
     * @return 代理对象
     */
    public Object bind() {
        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long startTimestamp = System.currentTimeMillis();
        System.out.println("startTime:"+startTimestamp);
        // ... 省略login逻辑...
        String methodName = method.getName();
        Object result = method.invoke(target, args);

        long endTimeStamp = System.currentTimeMillis();
        System.out.println("endTime:"+endTimeStamp);
        long responseTime = endTimeStamp - startTimestamp;
        System.out.println("【动态代理记录】"+methodName + "方法执行时间:" + responseTime);
        return result;
    }
}
