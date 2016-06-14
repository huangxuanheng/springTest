package com.ishow.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value="/banner",params={"name"})
	@ResponseBody
	public Object banner(){
		System.out.println("======= 我来了  ==============");
		Map<String,String>map=new HashMap<>();
		map.put("name", "huangxunheng");
		map.put("age", "90");
		map.put("cat", "45");
		return map;
	}

}
