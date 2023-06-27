package com.newid.openapi.dao;

import com.newid.openapi.domain.AuthDto;

public interface AuthDao {
	
	AuthDto select(String apikey, String secret) throws Exception;

}
