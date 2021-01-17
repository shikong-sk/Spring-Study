package cn.skcks.pojo;

public class Cat {
	public void shout(){
		System.out.println("猫 叫");
	}

	@Override
	public String toString() {
		return "猫";
	}
}