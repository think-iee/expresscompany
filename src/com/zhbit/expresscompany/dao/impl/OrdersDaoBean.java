package com.zhbit.expresscompany.dao.impl;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zhbit.expresscompany.dao.*;
import com.zhbit.expresscompany.domain.*;
public class OrdersDaoBean implements OrdersDao{
	private SessionFactory sessionFactory;
	public Orders save(Orders orders) {
		sessionFactory.getCurrentSession().save(orders);
		return orders;
	}
	public Orders update(Orders orders) {
		sessionFactory.getCurrentSession().update(orders);
		return orders;
	}

	public void delete(Orders orders) {
		sessionFactory.getCurrentSession().delete(orders);
	}
	
	public Orders getOrdersById(int oid) {
		return (Orders) sessionFactory.getCurrentSession().load(Orders.class, oid);
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
