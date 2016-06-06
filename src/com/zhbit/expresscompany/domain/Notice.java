package com.zhbit.expresscompany.domain;

import java.io.Serializable;

public class Notice implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
}