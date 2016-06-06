package com.zhbit.expresscompany.domain;

import java.io.Serializable;

public class SType implements Serializable{
	private static final long serialVersionUID = 1L;
	private int stid;
	private String stname;
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
}
