import cn.skcks.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 获取 Spring 上下文对象
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// 对象都交由 Spring 管理, 要使用时直接从里面取出即可
		Hello hello = (Hello)context.getBean("hello");
		hello.show();
	}
}