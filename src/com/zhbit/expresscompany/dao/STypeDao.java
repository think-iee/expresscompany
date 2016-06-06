package com.zhbit.expresscompany.dao;
import java.util.List;

import com.zhbit.expresscompany.domain.SType;
public interface STypeDao {
	
	SType save(SType sType);
	SType update(SType sType);
	void delete(SType sType);
	SType getSTypeById(int stid);
	SType getSTypeBySTypeName();
	List<SType> query();
}
