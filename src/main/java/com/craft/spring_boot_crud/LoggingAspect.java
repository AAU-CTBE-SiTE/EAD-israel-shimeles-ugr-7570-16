package com.craft.spring_boot_crud;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.craft.spring_boot_crud.ActorController.*(..))")
    public void controllerMethods() {}

    @Before("controllerMethods()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[AOP LOG] Executing method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "controllerMethods()", returning = "result")
    public void logAfter(JoinPoint joinPoint, Object result) {
        System.out.println("[AOP LOG] Finished executing method: " + joinPoint.getSignature().getName());
    }
}