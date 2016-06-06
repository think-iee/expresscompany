package com.zhbit.expresscompany.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.zhbit.expresscompany.dao.URecipientsDao;
import com.zhbit.expresscompany.domain.URecipients;

public class URecipientsDaoBean implements URecipientsDao {
	private SessionFactory sessionFactory;
	public URecipients save(URecipients urecipient) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(urecipient);
		return urecipient;
	}

	public URecipients update(URecipients urecipient) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(urecipient);
		return urecipient;
	}

	public void delect(URecipients urecipient) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(urecipient);
	}

	public URecipients getURecipientsByUrid(int urid) {
		// TODO Auto-generated method stub
		
		return (URecipients) sessionFactory.getCurrentSession().load(URecipients.class, urid);
	}

	public List<URecipients> query() {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().createQuery("from URecipients").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}
