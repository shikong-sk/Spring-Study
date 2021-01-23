import cn.skcks.mapper.UserMapper;
import cn.skcks.mapper.UserMapperImpl;
import cn.skcks.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class SimpleTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("查询所有用户");
		UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
		for (User user : userMapper.selectUser()) {
			System.out.println(user);
		}
		System.out.println();

		try{
			System.out.println("事务回滚测试");
			userMapper.testTransaction();
		} catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println(userMapper.selectUser());
		}

//		System.out.println("添加用户");
//		Random random = new Random();
//		int ranPwd = random.nextInt(99999 - 10000 + 1) + 10000;
//		random.setSeed(ranPwd + System.currentTimeMillis());
//		ranPwd = random.nextInt(99999 - 10000 + 1) + 10000;
//		User user = new User(666666, "测试", String.valueOf(ranPwd));
//		System.out.println(user);
//		userMapper.addUser(user);
//		// 编程式事务管理
////		try {
////			userMapper.addUser(user);
////			System.out.println("用户添加成功");
////		} catch (Exception e) {
////			System.out.println(e.getMessage());
////			System.out.println("用户添加失败");
////		}
//
//		System.out.println();
//
//		System.out.println("删除用户");
//		userMapper.deleteUserById(666666);
	}
}