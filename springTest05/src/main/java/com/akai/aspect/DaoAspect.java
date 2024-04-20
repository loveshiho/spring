package com.akai.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect // 声明为切面类
@Component // 让spring容器给我们进行实例化 ——> IOC
public class DaoAspect {
    // 定义一个公共切点,切点的名字就是方法名
    // 切点表达式直接指向接口
    @Pointcut("execution(* com.akai.dao.*.add*(..))")
    public void publicPointCut(){}

    @Before("publicPointCut()")
    public void methodBefore(JoinPoint joinPoint) {
        // 我们想要获取 addUser的实参列表，怎么获取
        // 通过 JoinPoint获取，JoinPoint就是切入点
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("daoMethodBefore invoked");
    }
    /*
     * 后置通知:方法执行之后要增强的功能
     * 无论切点方法是否出现异常都会执行的方法
     * 参数列表可以用JoinPoint接收切点对象
     * */
    @After("publicPointCut()")
    public void methodAfter() {
        System.out.println("daoMethodAfter invoked");
    }
    /*
     * 返回通知:切点方法正常运行结束后增强的功能
     * 如果方法运行过程中出现异常,则该功能不运行
     * 参数列表可以用 JoinPoint joinPoint接收切点对象
     * 可以用Object res接收方法返回值,需要用returning指定返回值名称
     * */
    @AfterReturning(value = "publicPointCut())", returning = "res")
    public void methodAfterReturning(JoinPoint joinPoint, Object res) {
        System.out.println("methodAfterReturning invoked");
        System.out.println(res);
    }
    /*
     * 异常通知:切点方法出现异常时运行的增强功能
     * 如果方法运行没有出现异常,则该功能不运行
     * 参数列表可以用Exception ex接收异常对象 需要通过throwing指定异常名称
     * */
    @AfterThrowing(value = "publicPointCut()", throwing = "ex")
    public void methodAfterThrowing(Exception ex){
        System.out.println("methodAfterThrowing invoked");
        System.out.println(ex.getMessage());
    }
    /*环绕通知:在切点方法之前和之后都进行功能的增强
     * 需要在通知中定义方法执行的位置,并在执行位置之前和之后自定义增强的功能
     * ProceedingJoinPoint 代表我们的切点
     * 通过proceedingJoinPoint.proceed()方法手动控制切点方法执行的位置
     * proceedingJoinPoint.proceed()有返回值，为切点方法的返回值
     * 环绕通知的返回值必须是 Object
     * 我们在环绕通知的最后需要将切点方法的返回值继续向上返回
     * */
    @Around(value = "publicPointCut()")
    public Object methodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("methodAround invoking");
        Object o = proceedingJoinPoint.proceed();   // 控制切点方法在这里执行,o代表切点方法的返回值
        System.out.println("methodAround invoked");
        return o;
    }
}
