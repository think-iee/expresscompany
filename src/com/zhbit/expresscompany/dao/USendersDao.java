package com.zhbit.expresscompany.dao;

import java.util.List;

import com.zhbit.expresscompany.domain.USenders;


public interface USendersDao {
	USenders save(USenders userder);
	USenders update(USenders userder);
	void delete(USenders userder);
	USenders getUSendersByUsid(int usid);
	List<USenders> query();
}
