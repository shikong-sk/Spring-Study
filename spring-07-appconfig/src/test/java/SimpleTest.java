import cn.skcks.config.Config;
import cn.skcks.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleTest {
	public static void main(String[] args) {
		// 如果完全使用配置类做配置, 那么只能通过 AnnotationConfigApplicationContext 获取容器
		// 通过配置类的 class 对象加载
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		User user = context.getBean("user", User.class);
		System.out.println(user.toString());
	}
}