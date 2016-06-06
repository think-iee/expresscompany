package com.zhbit.expresscompany.dao;

import java.util.List;

import com.zhbit.expresscompany.domain.Logisitcs;

public interface LogisitcsDao {
	List<Logisitcs> getLogisitcsByOid(int oid);
	Logisitcs save(Logisitcs logisitcs);
	Logisitcs update(Logisitcs logisitcs);
	void delete(Logisitcs logisitcs);	
}
