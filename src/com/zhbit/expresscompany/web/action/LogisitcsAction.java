package com.zhbit.expresscompany.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.Logisitcs;
import com.zhbit.expresscompany.service.LogisitcsSerive;

public class LogisitcsAction extends ActionSupport {
	private LogisitcsSerive serive;
	private int oid;
	private List<Logisitcs>logisitcslist;
	public String get(){
		System.out.println("----------------------"+oid);
		logisitcslist=serive.getLogisitcs(oid);
		return SUCCESS;
	}
	
	
	public LogisitcsSerive getSerive() {
		return serive;
	}
	
	public void setSerive(LogisitcsSerive serive) {
		this.serive = serive;
	}
	
	public int getOid() {
		return oid;
	}
	
	public void setOid(int oid) {
		this.oid = oid;
	}


	public List<Logisitcs> getLogisitcslist() {
		return logisitcslist;
	}


	public void setLogisitcslist(List<Logisitcs> logisitcslist) {
		this.logisitcslist = logisitcslist;
	}
	
	
	
}
