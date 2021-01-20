package cn.skcks.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
	/**
	 *
	 * @param method 要执行的目标对象的方法
	 * @param objects 参数
	 * @param target 目标对象
	 * @throws Throwable
	 */
	public void before(Method method, Object[] objects,Object target) throws Throwable {
		assert target != null;
		System.out.println("执行 " + target.getClass().getName() + " 的 " + method.getName() + " 方法");
	}
}