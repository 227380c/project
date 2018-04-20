package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello") 
	@ResponseBody
	public String index(String id) {
		System.out.println("id:" + id);
		return "Hello World1";
	}

    @RequestMapping("/hello2")
    @ResponseBody
	public String hello2( Model model) {
    	String result="OK";
    	model.addAttribute(result);
		return "hello world2";
	}
}