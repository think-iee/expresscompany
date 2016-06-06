package com.zhbit.expresscompany.web.action;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.*;
import com.zhbit.expresscompany.service.*;
public class OStateAction extends ActionSupport {
	private OState ostate;
	private OStateSerive serive;
	
	
	public String addOState(){
		serive.addOState(ostate);
		return SUCCESS;
	}
}
