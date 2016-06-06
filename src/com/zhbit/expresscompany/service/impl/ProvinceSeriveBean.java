package com.zhbit.expresscompany.service.impl;


import java.util.List;

import com.zhbit.expresscompany.dao.ProvinceDao;
import com.zhbit.expresscompany.domain.Province;
import com.zhbit.expresscompany.service.ProvinceSerive;

public class ProvinceSeriveBean implements ProvinceSerive{
  
	 private ProvinceDao provinceDao;
	 
	 public List<Province> getAllProvince(){
		 
		 List<Province> province=provinceDao.query();
		 
		 return province;
	 }
	 

	 public Province getPorvinceById(int pid){
		 Province province=provinceDao.getProvinceById(pid);
		 return province;
	 }
		

	public ProvinceDao getProvinceDao() {
		return provinceDao;
	}
	public void setProvinceDao(ProvinceDao provinceDao) {
		this.provinceDao = provinceDao;
	}


	public Province getProvinceById(int pid) {
		// TODO Auto-generated method stub
		 Province province=provinceDao.getProvinceById(pid);
		 return province;
	 
	}
	 
	
	
	
}
