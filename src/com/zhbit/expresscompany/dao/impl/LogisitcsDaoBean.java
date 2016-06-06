package com.zhbit.expresscompany.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.zhbit.expresscompany.dao.LogisitcsDao;
import com.zhbit.expresscompany.domain.Logisitcs;

public class LogisitcsDaoBean implements LogisitcsDao {
	private SessionFactory sessionFactory;

	public List<Logisitcs> getLogisitcsByOid(int oid) {
		// TODO Auto-generated method stub
		String hql="from Logisitcs where oid=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, oid);
		return query.list();
		
	}

	public Logisitcs save(Logisitcs logisitcs) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(logisitcs);
		return logisitcs;
	}

	public Logisitcs update(Logisitcs logisitcs) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(logisitcs);
		return logisitcs;
	}

	public void delete(Logisitcs logisitcs) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(logisitcs);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
