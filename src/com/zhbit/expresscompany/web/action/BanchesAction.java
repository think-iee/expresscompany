package com.zhbit.expresscompany.web.action;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import com.zhbit.expresscompany.domain.Banches;
import com.zhbit.expresscompany.domain.City;
import com.zhbit.expresscompany.domain.Province;
import com.zhbit.expresscompany.service.BanchesSerive;
import com.zhbit.expresscompany.service.CitySerive;
import com.zhbit.expresscompany.service.ProvinceSerive;

public class BanchesAction extends ActionSupport{
	private Banches banches;
	private BanchesSerive serive;
	private int bid;
	
	 private Province province;
	 private ProvinceSerive serive1;
	 private List<Province> allprovince;
	  
	    private City city;
		private CitySerive serive2;
		private List<City> allcity;
	
	public String add(){
		serive.add(banches);
		return "success";
	}
	
	public String get(){
		banches = serive.getBanches(banches.getBid());
		return "success";
	}
	
	public String delect(){
		serive.removeBanches(bid);
		return "success";
	}
	
	public String update(){
		banches = serive.getBanches(bid);
		allprovince=serive1.getAllProvince();
		allcity = serive2.getAllCity();
		return "input";
	}
	
	public String saveUpDate(){
		serive.upDate(banches);
		return "success";
	}
	
	
	public Banches getBanches() {
		return banches;
	}
	public void setBanches(Banches banches) {
		this.banches = banches;
	}
	public BanchesSerive getSerive() {
		return serive;
	}
	public void setSerive(BanchesSerive serive) {
		this.serive = serive;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public ProvinceSerive getSerive1() {
		return serive1;
	}

	public void setSerive1(ProvinceSerive serive1) {
		this.serive1 = serive1;
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

	public CitySerive getSerive2() {
		return serive2;
	}

	public void setSerive2(CitySerive serive2) {
		this.serive2 = serive2;
	}

	public List<City> getAllcity() {
		return allcity;
	}

	public void setAllcity(List<City> allcity) {
		this.allcity = allcity;
	}
	
}
