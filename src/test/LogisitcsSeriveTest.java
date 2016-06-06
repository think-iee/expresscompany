package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhbit.expresscompany.domain.Logisitcs;
import com.zhbit.expresscompany.service.LogisitcsSerive;
import com.zhbit.expresscompany.service.NoticeSerive;

public class LogisitcsSeriveTest {
	private static LogisitcsSerive serive;
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		serive = (LogisitcsSerive) context.getBean("logisitcsSerive");
	}

	@Test
	public void testAdd() {
		Logisitcs logisitcs=new Logisitcs();
		serive.add(logisitcs);	
	}

}
