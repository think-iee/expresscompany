package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhbit.expresscompany.service.StaffSerive;

public class StaffSeriveBeanTest {
	private StaffSerive serive;

	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		serive = (StaffSerive) context.getBean("staffSerive");
	}

	@Test
	public void testRemoveStaff() {
		serive.removeStaff(10000);
	}

}
