package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping("/")
	public String index(HttpSession httpSession) {

		httpSession.setAttribute("name", "jim");

		return "index";
	}

	@RequestMapping("/getSession")
	public String session(HttpSession session) {
		return "session: " + session.getAttribute("name");
	}
}
