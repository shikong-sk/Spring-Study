package cn.skcks.service;

// 真实对象
public class UserServiceImpl implements UserService {
	public void add() {
		System.out.println("添加 一个用户");
	}

	public void delete() {
		System.out.println("删除 一个用户");
	}

	public void update() {
		System.out.println("修改 一个用户");
	}

	public void select() {
		System.out.println("查询 一个用户");
	}
}