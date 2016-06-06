package com.zhbit.expresscompany.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.City;
import com.zhbit.expresscompany.domain.Province;
import com.zhbit.expresscompany.service.CitySerive;
import com.zhbit.expresscompany.service.ProvinceSerive;

public class ProvinceCityAction extends ActionSupport {
	private CitySerive cityserive;
	private ProvinceSerive provinceserive;
	private List<Province> allprovince;
	private List<City> allcity;
	private Map<Integer, List<City>> cityMap;
	
	
	
	
	public String tobranch(){
		
		cityMap=new HashMap<Integer,List<City>>();
		allprovince=provinceserive.getAllProvince();
		allcity=cityserive.getAllCity();
		int i;
		for(i=1;i<allprovince.size();++i){
			   Province province=allprovince.get(i-1);
			   List<City>getcity=cityserive.getCity(province.getPid());
			   Integer j=new Integer(i);
			   if(getcity.size()!=0){
				   cityMap.put(j, getcity);
			   }else{
				   System.out.print("²»¶Ô°¡°¡");
			   }
		   }
		return "branch";
		
	}
	
	public String tophone(){
		allprovince=provinceserive.getAllProvince();
		allcity=cityserive.getAllCity();
		return "phone";
	}
	
	public CitySerive getCityserive() {
		return cityserive;
	}
	public void setCityserive(CitySerive cityserive) {
		this.cityserive = cityserive;
	}
	public ProvinceSerive getProvinceserive() {
		return provinceserive;
	}
	public void setProvinceserive(ProvinceSerive provinceserive) {
		this.provinceserive = provinceserive;
	}


	public List<Province> getAllprovince() {
		return allprovince;
	}


	public void setAllprovince(List<Province> allprovince) {
		this.allprovince = allprovince;
	}


	public List<City> getAllcity() {
		return allcity;
	}


	public void setAllcity(List<City> allcity) {
		this.allcity = allcity;
	}

	public Map<Integer, List<City>> getCityMap() {
		return cityMap;
	}

	public void setCityMap(Map<Integer, List<City>> cityMap) {
		this.cityMap = cityMap;
	}
	
		
}
