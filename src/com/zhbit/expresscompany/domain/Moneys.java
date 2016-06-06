package com.zhbit.expresscompany.domain;

import java.io.Serializable;

public class Moneys implements Serializable{
	private static final long serialVersionUID = 1L;
	private int mid;
	private int mmoney;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getMmoney() {
		return mmoney;
	}
	public void setMmoney(int mmoney) {
		this.mmoney = mmoney;
	}
	
}
