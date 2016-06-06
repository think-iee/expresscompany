package com.zhbit.expresscompany.dao;

import java.util.List;

import com.zhbit.expresscompany.domain.Notice;;




public interface NoticeDao {
	Notice save(Notice notice);
	Notice update(Notice notice);
	void delete(Notice notice);
	Notice getNoticeById(Integer id);
	List<Notice> query();
}
