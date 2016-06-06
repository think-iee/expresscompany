package com.zhbit.expresscompany.web.action;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhbit.expresscompany.domain.City;
import com.zhbit.expresscompany.domain.Province;
import com.zhbit.expresscompany.service.CitySerive;
import com.zhbit.expresscompany.service.ProvinceSerive;

public class Test extends ActionSupport {
	private List<Province> provinces;
	private ProvinceSerive pserive;
	private CitySerive cserive;
	private Map<Province, List<City>> cityMap;
	 public Test(){
		 provinces=pserive.getAllProvince();
		 for(Province province:provinces){
			 List<City> cities;
			 cities=cserive.getCity(province.getPid());
			 cityMap.put(province,cities);
		 }
	 }

	 
	 public String execute() throws Exception {
		  return SUCCESS;
		 }
	 public String kk() throws Exception {
		  return SUCCESS;
		 }
		 
		 @SuppressWarnings("unchecked")
		 public List<City> getCities(){
		  ValueStack stack = ServletActionContext.getValueStack(ServletActionContext.getRequest());
		  Object province = stack.findValue("top");//获取栈顶对象
		  
		  
		  if(province != null && province instanceof Province){
		   
		   List<City> lst = (List<City>)cityMap.get(province);
		   return lst;
		  }
		  return Collections.EMPTY_LIST;
		 }
		public List<Province> getProvinces() {
			return provinces;
		}
		public void setProvinces(List<Province> provinces) {
			this.provinces = provinces;
		}
		public ProvinceSerive getPserive() {
			return pserive;
		}
		public void setPserive(ProvinceSerive pserive) {
			this.pserive = pserive;
		}
		public CitySerive getCserive() {
			return cserive;
		}
		public void setCserive(CitySerive cserive) {
			this.cserive = cserive;
		}
		public Map<Province, List<City>> getCityMap() {
			return cityMap;
		}
		public void setCityMap(Map<Province, List<City>> cityMap) {
			this.cityMap = cityMap;
		}
		 
		 
}
