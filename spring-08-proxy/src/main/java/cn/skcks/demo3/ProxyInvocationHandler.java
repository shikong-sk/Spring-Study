package cn.skcks.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

	private Rent rent;

	public void setRent(Rent rent) {
		this.rent = rent;
	}

	// 生成代理实例
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), this.rent.getClass().getInterfaces(),this);
	}

	// 处理代理实例并返回结果
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("rent")){
			watchHouse();
		}

		// 动态代理的本质就是反射机制
		Object result = method.invoke(rent,args);

		if(method.getName().equals("rent")){
			payFee();
			contract();
		}

		return result;
	}

	public void watchHouse(){
		System.out.println("中介 介绍 看房");
	}

	public void payFee(){
		System.out.println("中介 收 中介费");
	}

	public void contract(){
		System.out.println("签订 租赁合同");
	}
}