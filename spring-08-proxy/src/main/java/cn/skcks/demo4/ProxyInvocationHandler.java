package cn.skcks.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

	private Object target;

	public void setTarget(Object target) {
		this.target = target;
	}

	// 生成代理实例
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}

	public <T> T getProxy(Class<T> target) {
		try {
			setTarget(target.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return (T)getProxy();
	}

	// 处理代理实例并返回结果
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log(method.getName());

		// 动态代理的本质就是反射机制

		return method.invoke(target, args);
	}

	public void log(String msg) {
		System.out.println("[log] 调用了 '" + msg + "' 方法");
	}
}