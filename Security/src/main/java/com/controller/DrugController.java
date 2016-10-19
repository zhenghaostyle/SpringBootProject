package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrugController {

	@RequestMapping("/drug/add")
	public String add(){
		return "drug.add";
	}
	
	@RequestMapping("/drug/del")
	public String del(){
		return "drug.del";
	}
}
