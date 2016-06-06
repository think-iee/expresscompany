package com.zhbit.expresscompany.service;

import java.util.List;

import com.zhbit.expresscompany.domain.Province;



public interface ProvinceSerive {
	List<Province> getAllProvince();
	Province getProvinceById(int pid);
}
