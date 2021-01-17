import cn.skcks.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		People people = context.getBean("people", People.class);
		people.setName("Sk");
		System.out.println(people);

		if(people.getCat() != null){
			people.getCat().shout();
		}
		if (people.getDog() != null){
			people.getDog().shout();
		}
	}
}