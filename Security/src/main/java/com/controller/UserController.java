package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {


	@RequestMapping("/user/add")
	public String add() {
		return "user.add";
	}

	@RequestMapping("/user/update")
	public String update() {
		return "update";
	}
}
