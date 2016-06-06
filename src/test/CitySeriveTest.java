package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhbit.expresscompany.service.CitySerive;
import com.zhbit.expresscompany.service.LogisitcsSerive;

public class CitySeriveTest {
	private static CitySerive serive;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		serive = (CitySerive) context.getBean("citySerive");
	}

	@Test
	public void testGetCity() {
		serive.getCity(1);
	}

}
