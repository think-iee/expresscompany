package com.zhbit.expresscompany.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zhbit.expresscompany.dao.ProvinceDao;
import com.zhbit.expresscompany.domain.Province;
public class ProvinceDaoBean implements ProvinceDao{
	
	private SessionFactory sessionFactory;

	public List<Province> query() {
		return sessionFactory.getCurrentSession().createQuery("from Province").list();
	}
	
	public Province getProvinceById(int pid){
		return (Province)sessionFactory.getCurrentSession().load(Province.class,pid);
	}
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    
}
