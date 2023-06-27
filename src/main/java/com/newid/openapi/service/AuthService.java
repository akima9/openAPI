package com.newid.openapi.service;

import java.util.Map;

import com.newid.openapi.domain.AuthDto;

public interface AuthService {

	Map<String, String> getToken(AuthDto authDto) throws Exception;
	
}
