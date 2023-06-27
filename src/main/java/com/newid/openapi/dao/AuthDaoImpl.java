package com.newid.openapi.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newid.openapi.domain.AuthDto;

@Repository
public class AuthDaoImpl implements AuthDao {
	
	@Autowired SqlSession session;
	
	String namespace = "com.newid.openapi.dao.AuthMapper.";

	@Override
	public AuthDto select(String apikey, String secret) throws Exception {
		HashMap map = new HashMap();
		map.put("api_key", apikey);
		map.put("secret", secret);
		return session.selectOne(namespace + "select", map);
	}

}
