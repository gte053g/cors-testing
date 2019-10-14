package com.achsoftware.web.api2.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class ApiRestController {
	@RequestMapping("/corstest/")
	public String home(HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean auth = false;
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("authCookie")) {
					auth = true;
				}
			}
		}
		
		if(auth) {
			return "Spring boot is working!" + this.getClass().getPackage().getName();
		}
		
		response.sendError(HttpStatus.UNAUTHORIZED.value());
		return null;
	}
}
