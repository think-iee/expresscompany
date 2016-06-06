package com.zhbit.expresscompany.service.impl;

import java.util.List;

import com.zhbit.expresscompany.dao.STypeDao;
import com.zhbit.expresscompany.domain.Banches;
import com.zhbit.expresscompany.domain.SType;
import com.zhbit.expresscompany.service.STypeSerive;
import com.zhbit.expresscompany.service.StaffSerive;

public class STypeSeriveBean implements STypeSerive{
	
	private STypeDao sTypeDao;
	
	public SType add(SType sType){
		return sTypeDao.save(sType);
	}
	public void removeSType(int stid){
		SType sType = sTypeDao.getSTypeById(stid);
		sTypeDao.delete(sType);
	}
	public SType getSType(int stid){
		  return sTypeDao.getSTypeById(stid);
	}
	public List<SType> getALlSType(){
		 return sTypeDao.query();
	}
	public void upDate(SType sType){
		sTypeDao.update(sType);
	}
	
	public SType getTheSTypeBySTypeName(){
	System.out.println("dierge+++++++++++++++++++++++++++++++++++++++++");
	     return sTypeDao.getSTypeBySTypeName();
	}
	
	public STypeDao getsTypeDao() {
		return sTypeDao;
	}
	public void setsTypeDao(STypeDao sTypeDao) {
		this.sTypeDao = sTypeDao;
	}
	
}
