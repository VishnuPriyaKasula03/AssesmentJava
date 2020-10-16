package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController 
{
	@GetMapping(value="/")
	public String loadPage()
	{
		return "login"; ///Inside WEB-INF/pages
	}
	/*@PostMapping(value="/login")
	public String loginFunction(@ModelAttribute User user,Model model) //===(@RequestParam userId,@RequestParam userName,@RequesParam password)
	{
		System.out.println(user.getUserName());
		model.addAttribute("key",user);
		return "userSucess";
	}*/
	//can also be written as below
	@PostMapping(value="/login")
	public ModelAndView loginFunction(@ModelAttribute User user) //===(@RequestParam userId,@RequestParam userName,@RequesParam password)
	{
		ModelAndView modelAndView=new ModelAndView("userSucess");
		modelAndView.addObject("key",user);
		return modelAndView;
	}
	//collection of objects using map
	/*@PostMapping(value="/login")
	public ModelAndView loginFunction(@ModelAttribute User user) //===(@RequestParam userId,@RequestParam userName,@RequesParam password)
	{
		ModelAndView modelAndView=new ModelAndView("userSucess");
		Map<String,User> map=new HashMap();
		map.put("1", user);
		modelAndView.addAllObjects(map);
		return modelAndView;
	}*/
	

}
