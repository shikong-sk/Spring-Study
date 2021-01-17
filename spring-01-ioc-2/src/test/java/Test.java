import cn.skcks.dao.UserDao;
import cn.skcks.dao.UserDaoImpl;
import cn.skcks.service.UserService;
import cn.skcks.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		// 获取 ApplicationContext, Spring 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// 使用 getBean 获取需要的对象
		UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
		userService.getUser();

		UserServiceImpl userServiceMysql = (UserServiceImpl) context.getBean("userServiceMysqlImpl");
		userServiceMysql.getUser();
	}
}