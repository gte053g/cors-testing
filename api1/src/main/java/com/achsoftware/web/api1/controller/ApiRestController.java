package com.achsoftware.web.api1.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiRestController {
	@RequestMapping("/auth/")
	public String home(HttpServletResponse response) throws IOException {

		final Cookie cookie = new Cookie("authCookie", "fakeAuthToken");
		cookie.setSecure(false);
		cookie.setHttpOnly(true);
		cookie.setDomain("corstesting.com");
		cookie.setMaxAge(30);
		response.addCookie(cookie);
		
		return "index";
	}
}
