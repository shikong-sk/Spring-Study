package cn.skcks.mapper;

import cn.skcks.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
	public List<User> selectUser() {
		SqlSession session = getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		return userMapper.selectUser();
	}
}