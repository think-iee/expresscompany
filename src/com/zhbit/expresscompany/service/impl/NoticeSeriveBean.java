package com.zhbit.expresscompany.service.impl;




import com.zhbit.expresscompany.dao.NoticeDao;
import com.zhbit.expresscompany.domain.Notice;
import com.zhbit.expresscompany.service.NoticeSerive;


public class NoticeSeriveBean implements NoticeSerive {
    private NoticeDao noticeDao;
	
	public Notice add(Notice notice) {
		return noticeDao.save(notice);
	}

	public void removeNotice(Integer id) {
		Notice notice = noticeDao.getNoticeById(id);
		noticeDao.delete(notice);
	}

	public Notice getNotice(Integer id) {
		return noticeDao.getNoticeById(id);
	}

	public NoticeDao getNoticeDao() {
		return noticeDao;
	}

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
	

}
