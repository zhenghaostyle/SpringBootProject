package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.SimpleService;

@RestController
public class SimpleController {

	@Autowired // 自动注入
	private SimpleService service;

	@RequestMapping("/")
	public String home() {
		return service.say();
	}
}
