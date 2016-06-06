package com.zhbit.expresscompany.service;

import com.zhbit.expresscompany.domain.Notice;


public interface NoticeSerive {
	Notice add(Notice notice);
	void removeNotice(Integer id);
	Notice getNotice(Integer id);

}
