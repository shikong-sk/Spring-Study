package cn.skcks.custom;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 方法三 使用注解方式实现 AOP
@Aspect // 标注这个类是一个切面
public class AnnotationPointCut {
	@Before("execution(* cn.skcks.service.UserServiceImpl.*(..))")
	public void before(){
		System.out.println("============= [注解]方法执行前 =============");
	}

	@After("execution(* cn.skcks.service.UserServiceImpl.*(..))")
	public void after(){
		System.out.println("============= [注解]方法执行后 =============");
	}

	// 在环绕增强中, 可以给定一个参数, 代表要获取处理切入的点
	@Around("execution(* cn.skcks.service.UserServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("------------- [注解]环绕执行前 -------------");

		// 获取签名
		Signature signature = joinPoint.getSignature();
		System.out.println("signature => " + signature);

		// 执行方法
		Object proceed = joinPoint.proceed();

		System.out.println("------------- [注解]环绕执行后 -------------");

		return proceed;
	}
}