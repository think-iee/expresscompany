package com.zhbit.expresscompany.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.City;
import com.zhbit.expresscompany.service.CitySerive;

public class CityAction extends ActionSupport{
	private City city;
	private CitySerive serive;
	private List<City> allcity;
	
	public String get(){
		//allcity = serive.getCity(city.getCid());
		allcity=serive.getAllCity();
		return "success";
	}
	
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public CitySerive getSerive() {
		return serive;
	}
	public void setSerive(CitySerive serive) {
		this.serive = serive;
	}

	public List<City> getAllcity() {
		return allcity;
	}

	public void setAllcity(List<City> allcity) {
		this.allcity = allcity;
	}
	
   
}
