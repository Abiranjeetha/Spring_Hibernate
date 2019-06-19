package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.User;
import com.pack.service.UserService;

@Controller
@RequestMapping("/userRegistration.htm")
public class userController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showUserForm(ModelMap model)
	{
		User u=new User();
		model.addAttribute(u);
		return "userForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("user")User ur)
	{
		userService.add(ur);
		return "userSucess";
	}

}
