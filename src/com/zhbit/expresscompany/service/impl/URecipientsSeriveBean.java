package com.zhbit.expresscompany.service.impl;

import com.zhbit.expresscompany.dao.URecipientsDao;
import com.zhbit.expresscompany.domain.URecipients;
import com.zhbit.expresscompany.service.URecipientsSerive;

public class URecipientsSeriveBean implements URecipientsSerive {
	private URecipientsDao urecipientsDao;
	public URecipients add(URecipients urecipient) {
		// TODO Auto-generated method stub
		return urecipientsDao.save(urecipient);
	}

	public void removeURecipients(int urid) {
		// TODO Auto-generated method stub
		URecipients urecipient=urecipientsDao.getURecipientsByUrid(urid);
		urecipientsDao.delect(urecipient);
	}

	public URecipients getURecipients(int urid) {
		// TODO Auto-generated method stub
		return urecipientsDao.getURecipientsByUrid(urid);
	}

	public URecipientsDao getUrecipientsDao() {
		return urecipientsDao;
	}

	public void setUrecipientsDao(URecipientsDao urecipientsDao) {
		this.urecipientsDao = urecipientsDao;
	}
	
	
}
