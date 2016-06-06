package com.zhbit.expresscompany.service;

import java.util.List;

import com.zhbit.expresscompany.domain.City;

public interface CitySerive {
     List<City> getCity(int pid);
     List<City> getAllCity();
     City getCityByCId(int cid);
     City getCityByCid(int cid);
}
