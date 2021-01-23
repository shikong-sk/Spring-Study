package cn.skcks.mapper;

import cn.skcks.pojo.User;

import java.util.List;

public interface UserMapper {
	// 查询所有用户
	List<User> selectUser();

	// 添加用户
	int addUser(User user);

	// 删除用户
	int deleteUserById(int id);

	void testTransaction();
}