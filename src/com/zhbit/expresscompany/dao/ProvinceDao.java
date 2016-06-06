package com.zhbit.expresscompany.dao;
import java.util.List;

import com.zhbit.expresscompany.domain.Province;


public interface ProvinceDao {
	 
	List<Province> query();
	Province getProvinceById(int pid);
}
