package com.zhbit.expresscompany.dao;

import java.util.List;

import com.zhbit.expresscompany.domain.URecipients;


public interface URecipientsDao {
	URecipients save(URecipients urecipient);
	URecipients update(URecipients urecipient);
	void delect(URecipients urecipient);
	URecipients getURecipientsByUrid(int urid);
	List<URecipients> query();
} 
