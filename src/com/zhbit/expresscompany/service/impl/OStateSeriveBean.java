package com.zhbit.expresscompany.service.impl;
import java.util.List;

import com.zhbit.expresscompany.dao.*;
import com.zhbit.expresscompany.domain.*;
import com.zhbit.expresscompany.service.*;

public class OStateSeriveBean implements OStateSerive{
	private OStateDao ostateDao;
	public OState addOState(OState ostate) {
		return ostateDao.save(ostate);
	}
	public OStateDao getOstateDao() {
		return ostateDao;
	}
	public void setOstateDao(OStateDao ostateDao) {
		this.ostateDao = ostateDao;
	}
	
	public OState getOStateById(int osid) {
		return ostateDao.getOStateById(osid);
	}
}
