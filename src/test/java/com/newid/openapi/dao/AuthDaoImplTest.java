package com.newid.openapi.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.newid.openapi.domain.AuthDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class AuthDaoImplTest {
	
	@Autowired AuthDao authDao;
	
	@Test
	public void select() throws Exception {
		AuthDto authDto = authDao.select("dhx23-r89h7-4h9jk-p1007", "Ehfhfhdapsehfhd");
		assertTrue(authDto.getApi_key().equals("dhx23-r89h7-4h9jk-p1007"));
	}

}
