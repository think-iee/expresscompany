package com.zhbit.expresscompany.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.USenders;
import com.zhbit.expresscompany.service.USendersSerive;

public class USendersAction extends ActionSupport {
	private USenders usender;
	private USendersSerive serive;
	
	
	
	
	
	
	
	
	
	public USenders getUsender() {
		return usender;
	}
	public void setUsender(USenders usender) {
		this.usender = usender;
	}
	public USendersSerive getSerive() {
		return serive;
	}
	public void setSerive(USendersSerive serive) {
		this.serive = serive;
	}
	
	
}
