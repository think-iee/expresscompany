package com.zhbit.expresscompany.service;

import java.util.List;

import com.zhbit.expresscompany.domain.Logisitcs;

public interface LogisitcsSerive {
	Logisitcs add(Logisitcs logisitcs);
	List<Logisitcs> getLogisitcs(int oid);
}
