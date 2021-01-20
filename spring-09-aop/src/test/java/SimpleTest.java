import cn.skcks.service.UserService;
import cn.skcks.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 动态代理 代理的是接口
		UserService userService = context.getBean("userService", UserService.class);

		userService.add();
		userService.update();
		userService.select();
		userService.delete();

	}
}