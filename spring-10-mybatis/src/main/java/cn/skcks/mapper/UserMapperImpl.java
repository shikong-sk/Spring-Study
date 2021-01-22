package cn.skcks.mapper;

import cn.skcks.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
	// Mybatis 的所有操作都需要 sqlSession 来执行, 在 Spring 中使用 sqlSessionTemplate
	private SqlSessionTemplate sqlSession;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<User> selectUser() {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		return mapper.selectUser();
	}
}