package cn.skcks.demo2;

public class UserServiceProxy implements UserService{

	private UserServiceImpl userService;

	public UserServiceProxy() {
	}

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	public void add() {
		log("add User");
		userService.add();
	}

	public void delete() {
		log("delete User");
		userService.delete();
	}

	public void update() {
		log("update User");
		userService.update();
	}

	public void select() {
		log("select User");
		userService.select();
	}

	public void log(String msg){
		System.out.println(msg);
	}
}