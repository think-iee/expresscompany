package com.zhbit.expresscompany.domain;

import java.io.Serializable;
import java.util.Date;

public class Logisitcs implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int lid;
	private int oid;
	private String lcontext;
	private Date ltime;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getLcontext() {
		return lcontext;
	}
	public void setLcontext(String lcontext) {
		this.lcontext = lcontext;
	}
	public Date getLtime() {
		return ltime;
	}
	public void setLtime(Date ltime) {
		this.ltime = ltime;
	}
	
	
	
}
