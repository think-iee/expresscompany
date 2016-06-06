package com.zhbit.expresscompany.domain;
import java.io.Serializable;

public class City implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int cid;
	private String cname;
	private int pid;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}