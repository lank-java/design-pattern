package com.lank.proxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author lank
 * @since 2021/7/27 0:12
 */
@Aspect()
@Component
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AopDemo {

    @Pointcut("execution(* com.lank.proxy..*.*(..))")
    private void webLog() {
    }

    //请求method前打印内容
    @Around(value = "webLog()")//这个注解的作用是:在切点前执行方法,内容为指定的切点
    public Object methodBefore(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTimestamp = System.currentTimeMillis();
        System.out.println("startTime:"+startTimestamp);
        Object proceed = joinPoint.proceed();
        long endTimeStamp = System.currentTimeMillis();
        System.out.println("endTime:"+endTimeStamp);
        long responseTime = endTimeStamp - startTimestamp;
        System.out.println("【动态代理记录】方法执行时间:" + responseTime);
        return proceed;

    }
}
