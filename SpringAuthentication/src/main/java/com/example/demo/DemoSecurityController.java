package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoSecurityController {
	@ResponseBody
	@RequestMapping("/")
	public String demoMsg() {
		return "general audeince";
		
	}
	@ResponseBody
	@RequestMapping("/access1")
	public String request1() {
	return "admin";
	}
	@ResponseBody
	@RequestMapping("/access2")
	public String request2() {
	return "user";
	}
	@ResponseBody
	@RequestMapping("/access3")
	public String request3() {
	return "user and admin";
	}

}
