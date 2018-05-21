package com.study.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 有多种启动方式：
 * java jar
 * mvn spring-boot:run
 * 直接在该ide中启动
 * @author admin
 *
 */
@SpringBootApplication
public class Demo0Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo0Application.class, args);
	}
}
