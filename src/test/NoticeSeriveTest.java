package test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhbit.expresscompany.domain.Notice;
import com.zhbit.expresscompany.service.NoticeSerive;




public class NoticeSeriveTest {
	private static NoticeSerive serive;
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		serive = (NoticeSerive) context.getBean("noticeSerive");
		
	}



	@Test
	public void testAdd() {
		Notice notice = new Notice();
		notice.setTitle("yyyyyyyyyyyyyyyyyyyyyy");
		serive.add(notice);
	}

	@Test
	public void testRemoveNotice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNotice() {
		fail("Not yet implemented");
	}

}
