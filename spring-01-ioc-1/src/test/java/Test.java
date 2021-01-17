import cn.skcks.dao.UserDaoImpl;
import cn.skcks.dao.UserDaoMysqlImpl;
import cn.skcks.service.UserService;
import cn.skcks.service.UserServiceImpl;

public class Test {
	public static void main(String[] args){
		// 用户实际调用的是 业务 (Service) 层, 不需要接触 Dao 层
		UserService userService = new UserServiceImpl();

		((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
		userService.getUser();

		((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());

		userService.getUser();
	}
}