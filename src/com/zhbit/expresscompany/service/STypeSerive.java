package com.zhbit.expresscompany.service;


import java.util.List;

import com.zhbit.expresscompany.domain.SType;

public interface STypeSerive {
	SType add(SType sType);
	void removeSType(int stid);
	SType getSType(int stid);
	List<SType> getALlSType();
	void upDate(SType sType);
	SType getTheSTypeBySTypeName();
}
