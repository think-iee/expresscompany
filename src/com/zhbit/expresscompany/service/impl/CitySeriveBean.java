package com.zhbit.expresscompany.service.impl;

import java.util.List;

import com.zhbit.expresscompany.dao.CityDao;
import com.zhbit.expresscompany.domain.City;
import com.zhbit.expresscompany.service.CitySerive;

public class CitySeriveBean implements CitySerive{
	
	private CityDao cityDao;

	public List<City> getCity(int pid) {
		return cityDao.getCityById(pid);
	}
	
	public List<City> getAllCity(){
		return cityDao.query();
	}
	
    public City getCityByCid(int cid){
		return cityDao.getCityByCid(cid);
	}

	public City getCityByCId(int cid){
		return cityDao.getCityByCId(cid);
	}
	
	public CityDao getCityDao() {
		return cityDao;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}
	
	
}
