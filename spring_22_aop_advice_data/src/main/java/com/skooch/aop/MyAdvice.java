package com.skooch.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.skooch.dao.BookDao.findName(..))")
    private void pt() {}

    //JoinPoint获取方法参数
//    @Before("pt()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ..." );
    }

//    @After("pt()")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

//    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        Object ret = proceedingJoinPoint.proceed(args);
        return ret;
    }

    //获取返回值
//    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("afterReturning advice ..." + ret);
    }

    @AfterThrowing(value = "pt()", throwing = "err")
    public void afterThrowing(Throwable err) {
        System.out.println("afterThrowing advice ..." + err);
    }
}
