package com.zhbit.expresscompany.dao;

import java.util.List;

import com.zhbit.expresscompany.domain.User;

public interface UserDao {
	User save(User user);
	User update(User user);
	void delete(User user);
	User getUserByUid(String uid);
	List<User> query();
}
