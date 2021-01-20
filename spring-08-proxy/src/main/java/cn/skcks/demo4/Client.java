package cn.skcks.demo4;

import cn.skcks.demo2.UserService;
import cn.skcks.demo2.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		System.out.println("方法 1");
		method1();

		System.out.println("\n ==================================== \n");

		System.out.println("方法 2");
		method2();
	}

	public static void method1(){
		// 真实角色
		UserServiceImpl userService = new UserServiceImpl();
		// 代理处理调用程序
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
		proxyInvocationHandler.setTarget(userService);

		// 生成代理类
		UserService proxy = (UserService) proxyInvocationHandler.getProxy();

		proxy.add();
		proxy.update();
		proxy.select();
		proxy.delete();
	}

	public static void method2(){
		// 代理处理调用程序
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

		// 生成代理类
		UserService proxy = proxyInvocationHandler.getProxy(UserServiceImpl.class);

		proxy.add();
		proxy.update();
		proxy.select();
		proxy.delete();
	}
}