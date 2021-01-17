import cn.skcks.pojo.Address;
import cn.skcks.pojo.Student;
import cn.skcks.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

		Address address = (Address) context.getBean("address");
		System.out.println(address);
	}

	@org.junit.Test
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user);

		User user2 = context.getBean("user2", User.class);
		System.out.println(user2);

		System.out.println("bean id => user == user2: " + (user == user2));

		User user2Single = context.getBean("user2", User.class);
		System.out.println("bean id => user2 == user2: " + (user2 == user2Single));
	}
}