package com.zhbit.expresscompany.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.User;
import com.zhbit.expresscompany.service.UserSerive;

public class UserAction extends ActionSupport {
	private User user;
	private UserSerive serive;
	
	public String register(){	
		serive.add(user);
		return SUCCESS;
	}

	
	public String get(){
		User rightuser;
		rightuser=serive.getUser(user.getUid());
		if(rightuser.getUpd().equals(user.getUpd())){
			return "LoginUser";
		}else{
			return SUCCESS;
		}
		
	}

	public UserSerive getSerive() {
		return serive;
	}

	public void setSerive(UserSerive serive) {
		this.serive = serive;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
