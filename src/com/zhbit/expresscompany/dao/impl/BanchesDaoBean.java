package com.zhbit.expresscompany.dao.impl;
import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zhbit.expresscompany.dao.BanchesDao;
import com.zhbit.expresscompany.domain.Banches;
public class BanchesDaoBean implements BanchesDao{
	
	private SessionFactory sessionFactory;
	
	public Banches save(Banches banches) {
		sessionFactory.getCurrentSession().save(banches);
		return banches;
	}

	public Banches update(Banches banches) {
		sessionFactory.getCurrentSession().update(banches);
		return banches;
	}

	public void delete(Banches banches) {
		sessionFactory.getCurrentSession().delete(banches);
	}
    
	public Banches getBanchesById(int bid) {
		return (Banches) sessionFactory.getCurrentSession().load(Banches.class, bid);
	}

	public List<Banches> query() {
		return sessionFactory.getCurrentSession().createQuery("from Banches").list();
	}
        
        public List<Banches> notUseBanches(List list){
		//String hq1="from Bahches where bid not in(";
		//String hq2=",";
		//String hq3=")";
		//(int ii=0;ii<list.size();ii++){
			//String b=list.get(ii).toString();
			//hq1=hq1+b;
			//if(ii<list.size()-1)
			//hq1=hq1+hq2;
		//}
		//hq1=hq1+hq3;
		String hq1="from Bahches where bid not in(:ids)";
		Query query=sessionFactory.getCurrentSession().createQuery(hq1);
		query.setParameter("ids", 3);
		for(int ii=0;ii<list.size();ii++){
			query.setInteger(ii, Integer.parseInt(list.get(ii).toString())); 
		}
		return  query.list();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Banches> getBanchesByPidCid(int pid, int cid) {
		String hql="from Banches where pid=? and cid=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, pid);
		query.setInteger(1, cid);
		return query.list();
	}
}
