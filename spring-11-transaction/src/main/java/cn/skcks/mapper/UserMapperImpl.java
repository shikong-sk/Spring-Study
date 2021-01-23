package cn.skcks.mapper;

import cn.skcks.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Random;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

	public List<User> selectUser() {
		UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
		return mapper.selectUser();
	}

	public int addUser(User user) {
		return getSqlSession().getMapper(UserMapper.class).addUser(user);
	}

	public int deleteUserById(int id) {
		return getSqlSession().getMapper(UserMapper.class).deleteUserById(id);
	}

	public void testTransaction() {
		UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
		User user = new User(66666, "Test", "000000");

		int changeRows = 0;
		try {
			changeRows = mapper.addUser(user);
		} catch (Exception ignored) {
			mapper.deleteUserById(66666);
		}

		System.out.println(mapper.selectUser());

		if (changeRows > 0) {
			throw new RuntimeException("触发事务回滚");
		}
	}
}