package com.zhbit.expresscompany.service.impl;

import java.util.List;

import com.zhbit.expresscompany.dao.LogisitcsDao;
import com.zhbit.expresscompany.domain.Logisitcs;
import com.zhbit.expresscompany.service.LogisitcsSerive;

public class LogisitcsSeriveBean implements LogisitcsSerive {
	private LogisitcsDao logisitcsDao;
	public Logisitcs add(Logisitcs logisitcs) {
		// TODO Auto-generated method stub
		return logisitcsDao.save(logisitcs);
		
	}

	public List<Logisitcs> getLogisitcs(int oid) {
		// TODO Auto-generated method stub
		return logisitcsDao.getLogisitcsByOid(oid);
	}

	public LogisitcsDao getLogisitcsDao() {
		return logisitcsDao;
	}

	public void setLogisitcsDao(LogisitcsDao logisitcsDao) {
		this.logisitcsDao = logisitcsDao;
	}

}
