package com.zhbit.expresscompany.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.zhbit.expresscompany.dao.UserDao;
import com.zhbit.expresscompany.domain.Notice;
import com.zhbit.expresscompany.domain.User;

public class UserDaoBean implements UserDao {
	private SessionFactory sessionFactory;
	
	public User save(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		return user;
	}

	public User update(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(user);
		return user;
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(user);
	}

	public User getUserByUid(String uid) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession().load(User.class, uid);
		
	}

	public List<User> query() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
