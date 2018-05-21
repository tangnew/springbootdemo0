package com.study.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.boot.model.Girl;

/**
 * @Controller 必须使用模板 @RestController=@Controller+@ResponseBody
 */
//@RestController
@Controller
public class HelloController {

	@Value("${age}")
	private int age;
	

	@Value("${ageStr}")
	private String ageStr;
	
	@Autowired
	private Girl girl;
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public String hello() {
	System.out.println( "hello:" + age +";" +ageStr +"\n"+girl.toString());
	return "index";
	}
}
