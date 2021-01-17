package cn.skcks.service;

import cn.skcks.dao.UserDao;
import cn.skcks.dao.UserDaoImpl;
import cn.skcks.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

	//	private final UserDao userDao = new UserDaoImpl();
	//	private final UserDao userDao = new UserDaoMysqlImpl();

	private UserDao userDao;

	// 利用 set 进行动态实现值的注入
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getUser() {
		userDao.getUser();
	}
}