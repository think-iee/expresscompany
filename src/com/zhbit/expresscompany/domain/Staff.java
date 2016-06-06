package com.zhbit.expresscompany.domain;

import java.io.Serializable;

public class Staff implements Serializable{
	private static final long serialVersionUID = 1L;
	private int sid;
	private String spd;
	private String sname;
	private String sphone;
	private String saddress;
	private int bid;
	private int stid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSpd() {
		return spd;
	}
	public void setSpd(String spd) {
		this.spd = spd;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	
	
}
