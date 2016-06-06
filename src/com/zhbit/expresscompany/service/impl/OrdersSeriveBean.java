package com.zhbit.expresscompany.service.impl;

import java.util.List;

import com.zhbit.expresscompany.dao.*;
import com.zhbit.expresscompany.domain.*;
import com.zhbit.expresscompany.service.*;

public class OrdersSeriveBean implements OrdersSerive{
	private OrdersDao ordersDao;
	public Orders addOrders(Orders orders) {
		return ordersDao.save(orders);
	}
	
	public Orders getOrdersById(int oid) {
		return ordersDao.getOrdersById(oid);
	}
	
	public OrdersDao getOrdersDao() {
		return ordersDao;
	}
	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}
	
	
}
