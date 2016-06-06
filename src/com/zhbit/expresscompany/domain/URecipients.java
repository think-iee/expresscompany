package com.zhbit.expresscompany.domain;

import java.io.Serializable;

public class URecipients implements Serializable {
	private int urid;
	private String uid;
	private String urname;
	private String urphone;
	private String uraddress;
	public int getUrid() {
		return urid;
	}
	public void setUrid(int urid) {
		this.urid = urid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUrname() {
		return urname;
	}
	public void setUrname(String urname) {
		this.urname = urname;
	}
	public String getUrphone() {
		return urphone;
	}
	public void setUrphone(String urphone) {
		this.urphone = urphone;
	}
	public String getUraddress() {
		return uraddress;
	}
	public void setUraddress(String uraddress) {
		this.uraddress = uraddress;
	}
	
	
	
}
