package com.zhbit.expresscompany.service;
import java.util.List;

import com.zhbit.expresscompany.domain.*;
public interface OrdersSerive {
	Orders addOrders(Orders orders);
	 Orders getOrdersById(int oid) ;
}
