package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration
						// @ComponentScan
public class Application {
	public static void main(String[] args) throws Exception {
		// 加入devtools之后，修改代码会自动部署
		System.setProperty("spring.devtools.restart.enabled", "false");// 关闭自动重启功能
		SpringApplication.run(Application.class, args);
	}
}
