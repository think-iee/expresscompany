package com.zhbit.expresscompany.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.Notice;
import com.zhbit.expresscompany.service.NoticeSerive;


public class NoticeAction extends ActionSupport {
	private Notice notice;
	private NoticeSerive serive;
	
	
	public String add(){
		serive.add(notice);
		return SUCCESS;
	}
	
	public String get(){
		notice = serive.getNotice(notice.getId());
		return SUCCESS;
	}

	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public NoticeSerive getSerive() {
		return serive;
	}

	public void setSerive(NoticeSerive serive) {
		this.serive = serive;
	}
	
	

}
