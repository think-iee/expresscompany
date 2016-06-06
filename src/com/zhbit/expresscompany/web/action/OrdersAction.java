package com.zhbit.expresscompany.web.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.*;
import com.zhbit.expresscompany.service.*;

public class OrdersAction extends ActionSupport {
	private Orders orders;
	private OrdersSerive serive;
	private HttpServletResponse response;
    private HttpServletRequest request;
	private int spid;//寄件省份ID
	private int scid;//寄件城市ID
	private int rpid;//收件省份ID
	private int rcid;//收件城市ID
	private ProvinceSerive pserive;
	private CitySerive cserive;
	
	public String addOrders(){
		Province sprovince=new Province();
		City scity=new City();
		System.out.println(spid);
		System.out.println(scid);
		System.out.println(rpid);
		System.out.println(rcid);
		sprovince=pserive.getProvinceById(spid);//求寄件详细地址
		scity=cserive.getCityByCId(scid);
		String usaddress=sprovince.getPname()+"-"+scity.getCname()+"-"+orders.getUsaddress();
		orders.setUsaddress(usaddress);
		
		Province rprovince=new Province();
		City rcity=new City();
		rprovince=pserive.getProvinceById(rpid);//求收件详细地址
		rcity=cserive.getCityByCId(rcid);
		String uraddress=rprovince.getPname()+"-"+rcity.getCname()+"-"+orders.getUraddress();
		orders.setUraddress(uraddress);
		
		int weight=(int)orders.getOweight()/10;//计算运费
		orders.setOmoney(weight*10);
		if(!sprovince.equals(rprovince)){
			orders.setOmoney(weight*10+10);
		}
		
		orders.setOsid(1);//订单状态
		orders.setUid(null);
		serive.addOrders(orders);
		return SUCCESS;
	}


	public Orders getOrders() {
		return orders;
	}


	public void setOrders(Orders orders) {
		this.orders = orders;
	}


	public OrdersSerive getSerive() {
		return serive;
	}


	public void setSerive(OrdersSerive serive) {
		this.serive = serive;
	}


	public HttpServletResponse getResponse() {
		return response;
	}


	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}


	public HttpServletRequest getRequest() {
		return request;
	}


	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}


	public int getSpid() {
		return spid;
	}


	public void setSpid(int spid) {
		this.spid = spid;
	}


	public int getScid() {
		return scid;
	}


	public void setScid(int scid) {
		this.scid = scid;
	}


	public int getRpid() {
		return rpid;
	}


	public void setRpid(int rpid) {
		this.rpid = rpid;
	}


	public int getRcid() {
		return rcid;
	}


	public void setRcid(int rcid) {
		this.rcid = rcid;
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


	
	
}
