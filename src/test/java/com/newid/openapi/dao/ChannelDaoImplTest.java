package com.newid.openapi.dao;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.newid.openapi.domain.ChannelDto;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class ChannelDaoImplTest {
	
	@Autowired
	ChannelDao channelDao;
	
	@Test
	public void select() throws Exception {
		ChannelDto channelDto = channelDao.select("newid_010");
		assertTrue(channelDto.getChannel_id().equals("newid_010"));
	}
	
	@Test
	public void selectAll() throws Exception {
		List<ChannelDto> list = channelDao.selectAll();
		assertTrue(list.size() == 173);
	}

}
