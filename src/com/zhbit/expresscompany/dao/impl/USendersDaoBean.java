package com.zhbit.expresscompany.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.zhbit.expresscompany.dao.USendersDao;
import com.zhbit.expresscompany.domain.USenders;

public class USendersDaoBean implements USendersDao {
	private SessionFactory sessionFactory;
	
	public USenders save(USenders userder) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(userder);
		return userder;
	}

	public USenders update(USenders userder) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(userder);
		return userder;
	}

	public void delete(USenders userder) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(userder);
	}

	public USenders getUSendersByUsid(int usid) {
		// TODO Auto-generated method stub
		return (USenders)sessionFactory.getCurrentSession().load(USenders.class, usid);
	}

	public List<USenders> query() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from USenders").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
