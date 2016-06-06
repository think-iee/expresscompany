package com.zhbit.expresscompany.dao;
import java.util.List;

import com.zhbit.expresscompany.domain.City;


public interface CityDao {
	List<City> getCityById(int pid);
	List<City> query();
	City getCityByCId(int cid);
	City getCityByCid(int cid);
}
