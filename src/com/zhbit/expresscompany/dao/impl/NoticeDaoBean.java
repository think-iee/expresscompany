package com.zhbit.expresscompany.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.zhbit.expresscompany.dao.NoticeDao;
import com.zhbit.expresscompany.domain.Notice;

public class NoticeDaoBean implements NoticeDao {
	private SessionFactory sessionFactory;

	public Notice save(Notice notice) {
		sessionFactory.getCurrentSession().save(notice);
		return notice;
	}

	public Notice update(Notice notice) {
		sessionFactory.getCurrentSession().update(notice);
		return notice;
	}

	public void delete(Notice notice) {
		sessionFactory.getCurrentSession().delete(notice);
	}

	public Notice getNoticeById(Integer id) {
		return (Notice) sessionFactory.getCurrentSession().load(Notice.class, id);
	}

	public List<Notice> query() {
		return sessionFactory.getCurrentSession().createQuery("from Notice").list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
}
