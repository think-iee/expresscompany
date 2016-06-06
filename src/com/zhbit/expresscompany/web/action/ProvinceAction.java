package com.zhbit.expresscompany.web.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.Banches;
import com.zhbit.expresscompany.domain.City;
import com.zhbit.expresscompany.domain.Province;
import com.zhbit.expresscompany.domain.Website;
import com.zhbit.expresscompany.service.BanchesSerive;
import com.zhbit.expresscompany.service.CitySerive;
import com.zhbit.expresscompany.service.ProvinceSerive;

public class ProvinceAction extends ActionSupport {
  private Province province;
  private ProvinceSerive serive;
  private List<Province> allprovince;
  
    private City city;
	private CitySerive serive1;
	private List<City> allcity;
	
  private Banches banches;
  private BanchesSerive serive2;
  private List<Banches> allbanches;
	private Map<Integer, List<City>> cityMap;

   private List<Website> allwebsite=new ArrayList<Website> ();	  
  
  public String get(){
	   allprovince=serive.getAllProvince();
	   allcity = serive1.getAllCity();
	   allbanches=serive2.getALlBanches();
	  
	  for(int i=0;i<allbanches.size();i++){
		   Website website=new Website();
		   website.setBid(allbanches.get(i).getBid());
		   website.setBname(allbanches.get(i).getBname());
		   website.setPname(serive.getProvinceById(allbanches.get(i).getPid()).getPname());
		   website.setCname(serive1.getCityByCid(allbanches.get(i).getCid()).getCname());
		   website.setBaddress(allbanches.get(i).getBaddress());
		   website.setBphone(allbanches.get(i).getBphone());
	       allwebsite.add(website);
	       System.out.println(website.getBid());
		   System.out.println(website.getBname());
		   System.out.println(website.getBphone());
	   }  
	   return "success";
  }

  public String getAll()throws Exception{

		List<City> getcity= new ArrayList<City>();
		  cityMap = new HashMap<Integer, List<City>>();
		int i;
		allprovince=serive.getAllProvince();
		for(i=1;i<allprovince.size();++i){
			   province=allprovince.get(i-1);
			   getcity=serive1.getCity(province.getPid());
			   Integer j=new Integer(i);
			   if(getcity.size()!=0){
				   cityMap.put(j, getcity);
			   }else{
				   System.out.print("²»¶Ô°¡°¡");
			   }
		   }
		   return SUCCESS;
	 }
  
public Province getProvince() {
	return province;
}

public void setProvince(Province province) {
	this.province = province;
}

public ProvinceSerive getSerive() {
	return serive;
}

public void setSerive(ProvinceSerive serive) {
	this.serive = serive;
}

public List<Province> getAllprovince() {
	return allprovince;
}

public void setAllprovince(List<Province> allprovince) {
	this.allprovince = allprovince;
}

public City getCity() {
	return city;
}

public void setCity(City city) {
	this.city = city;
}

public CitySerive getSerive1() {
	return serive1;
}

public void setSerive1(CitySerive serive1) {
	this.serive1 = serive1;
}

public List<City> getAllcity() {
	return allcity;
}

public void setAllcity(List<City> allcity) {
	this.allcity = allcity;
}

public Banches getBanches() {
	return banches;
}

public void setBanches(Banches banches) {
	this.banches = banches;
}

public BanchesSerive getSerive2() {
	return serive2;
}

public void setSerive2(BanchesSerive serive2) {
	this.serive2 = serive2;
}

public List<Banches> getAllbanches() {
	return allbanches;
}

public void setAllbanches(List<Banches> allbanches) {
	this.allbanches = allbanches;
}

public List<Website> getAllwebsite() {
	return allwebsite;
}

public void setAllwebsite(List<Website> allwebsite) {
	this.allwebsite = allwebsite;
}

public Map<Integer, List<City>> getCityMap() {
	return cityMap;
}

public void setCityMap(Map<Integer, List<City>> cityMap) {
	this.cityMap = cityMap;
}
  

}
