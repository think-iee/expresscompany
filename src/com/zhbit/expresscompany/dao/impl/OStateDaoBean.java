package com.zhbit.expresscompany.dao.impl;
import java.util.List;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.zhbit.expresscompany.dao.*;
import com.zhbit.expresscompany.domain.*;
public class OStateDaoBean implements OStateDao{
	private SessionFactory sessionFactory;
	public OState save(OState ostate) {
		sessionFactory.getCurrentSession().save(ostate);
		return ostate;
	}
	public OState update(OState ostate) {
		sessionFactory.getCurrentSession().update(ostate);
		return ostate;
	}

	public void delete(OState ostate) {
		sessionFactory.getCurrentSession().delete(ostate);
	}
	
	public OState getOStateById(int osid) {
		return (OState) sessionFactory.getCurrentSession().load(OState.class, osid);
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
