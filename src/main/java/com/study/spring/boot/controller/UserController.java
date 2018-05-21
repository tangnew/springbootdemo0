package com.study.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@GetMapping(value="/say/{id}")
	@ResponseBody
	public String say(@PathVariable Integer id) {
		return new String(id.toString());
	}
	
}
   