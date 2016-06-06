package com.zhbit.expresscompany.dao.impl;

import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.zhbit.expresscompany.dao.STypeDao;
import com.zhbit.expresscompany.domain.Notice;
import com.zhbit.expresscompany.domain.SType;

public class STypeDaoBean implements STypeDao{
	
	private SessionFactory sessionFactory;
    
	public SType save(SType sType){
		sessionFactory.getCurrentSession().save(sType);
		return sType;
	}
	public SType update(SType sType){
		sessionFactory.getCurrentSession().update(sType);
		return sType;
	}
	public void delete(SType sType){
		sessionFactory.getCurrentSession().delete(sType);
	}
	public SType getSTypeById(int stid){
		return (SType) sessionFactory.getCurrentSession().load(SType.class, stid);
	}
	public SType getSTypeBySTypeName(){
		String name="Íøµã¾­Àí";
		System.out.println("diyige________________________________________________________");
		String hql="from SType where stname=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, name);	
		return  (SType)query.list().get(0);
		
	}
	public List<SType> query(){
		return sessionFactory.getCurrentSession().createQuery("from SType").list();
	}
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
