package com.ishow.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="/login")
	@ResponseBody
	public Object login(){
		System.out.println("======= 我来了  ==============");
		Map<String,String>map=new HashMap<>();
		map.put("name", "huangxunheng");
		map.put("age", "28");
		map.put("cat", "56");
		return map;
	}

}
