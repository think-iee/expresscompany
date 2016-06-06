package com.zhbit.expresscompany.domain;

import java.io.Serializable;

public class USenders implements Serializable{
	private static final long serialVersionUID = 1L;
	private int usid;
	private String uid;
	private String usname;
	private String usphone;
	private String usaddress;
	public int getUsid() {
		return usid;
	}
	public void setUsid(int usid) {
		this.usid = usid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsname() {
		return usname;
	}
	public void setUsname(String usname) {
		this.usname = usname;
	}
	public String getUsphone() {
		return usphone;
	}
	public void setUsphone(String usphone) {
		this.usphone = usphone;
	}
	public String getUsaddress() {
		return usaddress;
	}
	public void setUsaddress(String usaddress) {
		this.usaddress = usaddress;
	}
}
