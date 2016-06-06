package com.zhbit.expresscompany.dao.impl;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.zhbit.expresscompany.dao.CityDao;
import com.zhbit.expresscompany.domain.City;
import com.zhbit.expresscompany.domain.Province;

public class CityDaoBean implements CityDao{
	
	private SessionFactory sessionFactory;
	
	public List<City> getCityById(int pid) {
		String hql="from City where pid=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, pid);
		return  query.list();
	}
    
	public List<City> query(){
		return sessionFactory.getCurrentSession().createQuery("from City").list();
	}
	
	public City getCityByCid(int cid){
		return (City) sessionFactory.getCurrentSession().load(City.class, cid);
	}
	
	public City getCityByCId(int cid){
		City city=new City();
		city=(City)sessionFactory.getCurrentSession().load(City.class,cid);
		return city;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
