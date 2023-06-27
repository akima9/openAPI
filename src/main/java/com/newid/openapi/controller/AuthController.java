package com.newid.openapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@GetMapping("/auth")
	public String auth(String apikey, String secret) {
		System.out.println(apikey);
		System.out.println(secret);
		return "call auth()";
	}
}
