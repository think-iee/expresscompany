package com.zhbit.expresscompany.domain;

import java.io.Serializable;

public class OState implements Serializable{
	private static final long serialVersionUID = 1L;
	private int osid;
	private String osname;
	public int getOsid() {
		return osid;
	}
	public void setOsid(int osid) {
		this.osid = osid;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	
}
