package com.newid.openapi.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.newid.openapi.domain.ChannelDto;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class RtChannelDaoImplTest {

	@Autowired
	RtChannelDao rtChannelDao;
	
	@Test
	public void selectAll() throws Exception {
		List<ChannelDto> list = rtChannelDao.selectAll();
		System.out.println(list);
	}
	
}
