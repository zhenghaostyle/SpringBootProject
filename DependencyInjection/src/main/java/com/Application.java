package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan//自动扫描bean
//@EnableAutoConfiguration 
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
	public static void main(String[] args) throws Exception {
		// 启动
		SpringApplication.run(Application.class, args);
	}
}
