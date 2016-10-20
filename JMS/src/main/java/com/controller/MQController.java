package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.MQConsumerService;
import com.service.MQProduceService;

@RestController
public class MQController {

	@Autowired
	private MQProduceService produceService;

	@Autowired
	private MQConsumerService consumerService;

	@RequestMapping("/send")
	public String send() {
		produceService.send("this is an activemq message");
		return "send";
	}
	
	@RequestMapping("/receive")
	public String receive() {
		String str = consumerService.receive();
		return str;
	}
}
