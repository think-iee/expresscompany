package com.zhbit.expresscompany.domain;
import java.io.Serializable;
public class Province implements Serializable{
	private static final long serialVersionUID = 1L;
	private int pid; 
	private String pname;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
}
