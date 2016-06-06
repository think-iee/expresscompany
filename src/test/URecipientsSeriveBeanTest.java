package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhbit.expresscompany.domain.URecipients;
import com.zhbit.expresscompany.service.URecipientsSerive;

public class URecipientsSeriveBeanTest {
	private static URecipientsSerive serive;
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		serive=(URecipientsSerive) context.getBean("urecipientsSerive");
	}

	@Test
	public void testAdd() {
		URecipients urecipient=new URecipients();
		urecipient.setUid("1");
		urecipient.setUraddress("2");
		urecipient.setUrid(1);
		urecipient.setUrname("3");
		urecipient.setUrphone("333");
		serive.add(urecipient);
	}

}
