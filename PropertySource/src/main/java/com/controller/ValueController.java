package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

	@Value("${str}")//从配置文件中读取str的属性值
	private String value;
	@Value("${number}")
	private int number;

	@RequestMapping("/")
	public String home() {
		return value + number;
	}
}
