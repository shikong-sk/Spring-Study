package cn.skcks.pojo;

public class User2 {
	private String name = "User2";

	public User2() {
		System.out.println("User2 无参构造函数");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show(){
		System.out.println("name: " + getName());
	}
}