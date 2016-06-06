package com.zhbit.expresscompany.service.impl;

import com.zhbit.expresscompany.dao.USendersDao;
import com.zhbit.expresscompany.domain.USenders;
import com.zhbit.expresscompany.service.USendersSerive;

public class USendersSeriveBean implements USendersSerive {
	private USendersDao usendersDao;
	
	public USenders add(USenders usender) {
		// TODO Auto-generated method stub
		return usendersDao.save(usender);
	}

	public void removeUsender(int usid) {
		// TODO Auto-generated method stub
		USenders usender=usendersDao.getUSendersByUsid(usid);
		usendersDao.delete(usender);
	}

	public USenders getUsender(int usid) {
		// TODO Auto-generated method stub
		return usendersDao.getUSendersByUsid(usid);
	}

	public USendersDao getUsendersDao() {
		return usendersDao;
	}

	public void setUsendersDao(USendersDao usendersDao) {
		this.usendersDao = usendersDao;
	}

	
}
