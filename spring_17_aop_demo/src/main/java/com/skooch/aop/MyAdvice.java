package com.skooch.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component //定义通知类受Spring容器管理
@Aspect //定义当前类为通知类
public class MyAdvice {

    //定义切入点
//    @Pointcut("execution(void com.skooch.dao.BookDao.update())")
//    @Pointcut("execution(* com.skooch.dao.BookDao.update())")
    @Pointcut("execution(* com.skooch.dao.BookDao.u*(..))")
    private void pt() {}


    //定义通知
//    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }

    //前置通知
//    @Before("pt()")
    public void before() {
        System.out.println("before advice...");
    }

    //后置通知
//    @After("pt()")
    public void after() {
        System.out.println("after advice...");
    }

    //环绕通知最常用
    //依赖形参
    //需要对原始方法进行调用，可以实现对原始操作进行隔离
    //需要强制抛出一个异常
    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice...");
        Integer ret = (Integer) proceedingJoinPoint.proceed();//代表对原始操作的调用
        System.out.println("around after advice...");
        ret += 100;
        return ret;
    }

//    @AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("afterReturning advice...");
    }

//    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice...");
    }
}
