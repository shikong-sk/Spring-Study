package cn.skcks.demo3;

public class Client {
	public static void main(String[] args){
		// 真实角色
		Master master = new Master();
		// 代理调用程序
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
		// 设置代理调用程序要处理调用的接口对象
		proxyInvocationHandler.setRent(master);
		// 此处的 proxy 为处理程序动态生成的对象
		Rent proxy = (Rent) proxyInvocationHandler.getProxy();
		proxy.rent();
	}
}