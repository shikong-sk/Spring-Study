import cn.skcks.pojo.User;
import cn.skcks.pojo.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
//		User user= new User();
		// 默认获取并使用无参构造方法实例化对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) context.getBean("user");
		user.show();

		User2 user2 = (User2) context.getBean("userAlias");
		user2.show();
		User2 u2 = (User2) context.getBean("u2");
		u2.show();
	}
}