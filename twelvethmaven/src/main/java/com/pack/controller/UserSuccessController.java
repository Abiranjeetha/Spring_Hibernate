package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserSuccessController {
	
	@RequestMapping("/userSuccess.htm")
	public String redirect()
	{
		return "userSucess";
	}

}
