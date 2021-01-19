package cn.skcks.demo1;

public class Client {
	public static void main(String[] args){
//		Master master = new Master();
//		master.rent();
		Proxy proxy = new Proxy(new Master());
		proxy.rent();
	}
}