import cn.skcks.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class SimpleTest {
	@Test
	public void testSpring(){
		System.out.println("Spring 整合 Mybatis");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
		System.out.println(userMapper.selectUser());
	}

	@Test
	public void testMybatis() throws IOException {
		System.out.println("纯 Mybatis");

		String resources = "mybatis-only.xml";
		InputStream inputStream = Resources.getResourceAsStream(resources);

		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sessionFactory.openSession();

		UserMapper userMapper = session.getMapper(UserMapper.class);

		System.out.println(userMapper.selectUser());
	}
}