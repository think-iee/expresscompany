package com.zhbit.expresscompany.service;

import com.zhbit.expresscompany.domain.URecipients;

public interface URecipientsSerive {
	URecipients add(URecipients urecipients);
	void removeURecipients(int urid);
	URecipients getURecipients(int urid);
}
