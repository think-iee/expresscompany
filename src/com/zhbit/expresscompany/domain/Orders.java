package com.zhbit.expresscompany.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable{
	private static final long serialVersionUID = 1L;
	private int oid;
	private String uid;
	private String usname;
	private String usphone;
	private String usaddress;
	private String urname;
	private String urphone;
	private String uraddress;
	private String oremark;
	private String owname;
	private int oweight;
	private int omoney;
	private Date obegintime;
	private Date oendtime;
	private int osid;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
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
	public String getOremark() {
		return oremark;
	}
	public void setOremark(String oremark) {
		this.oremark = oremark;
	}
	public String getOwname() {
		return owname;
	}
	public void setOwname(String owname) {
		this.owname = owname;
	}
	public int getOweight() {
		return oweight;
	}
	public void setOweight(int oweight) {
		this.oweight = oweight;
	}
	public Date getObegintime() {
		return obegintime;
	}
	public void setObegintime(Date obegintime) {
		this.obegintime = obegintime;
	}
	public Date getOendtime() {
		return oendtime;
	}
	public void setOendtime(Date oendtime) {
		this.oendtime = oendtime;
	}
	public int getOsid() {
		return osid;
	}
	public void setOsid(int osid) {
		this.osid = osid;
	}
	public int getOmoney() {
		return omoney;
	}
	public void setOmoney(int omoney) {
		this.omoney = omoney;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
