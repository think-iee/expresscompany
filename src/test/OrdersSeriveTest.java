package test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhbit.expresscompany.domain.*;
import com.zhbit.expresscompany.service.*;
public class OrdersSeriveTest {
	private static OrdersSerive serive;
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		serive = (OrdersSerive) context.getBean("ordersSerive");
		
	}
	@Test
	public void testGetOrders() {
		serive.getOrdersById(10000000);
		
	}
	
	
	
}
