package cn.skcks.demo1;

public class Proxy implements Rent {
	private Master master;

	public Proxy() {
	}

	public Proxy(Master host) {
		this.master = host;
	}

	public void rent() {
		watchHouse();
		master.rent();
		contract();
		payFee();
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