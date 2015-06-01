package com.bmsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = { "/index" , "/BansiMarutiService" , "/home" , "/"})
	public String index(){
		return "index";
	}
}
