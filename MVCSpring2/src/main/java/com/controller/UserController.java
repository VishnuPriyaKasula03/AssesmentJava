package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController 
{
	@GetMapping(value="*")
	public String fallBackMethod()
	{
		return "dummy"; ///Inside WEB-INF/pages
	}
	//for using custom tags for providing access to model
	@GetMapping(value="/aa")
	public String loadPage(Model model)
	{
		User user=new User();
		model.addAttribute("alias",user);
		return "login"; ///Inside WEB-INF/pages
	}
	/*@GetMapping(value="/")
	public String loadPage()
	{
		return "login"; ///Inside WEB-INF/pages
	}*/
	/*@PostMapping(value="/login")
	public String loginFunction(@ModelAttribute User user,Model model) //===(@RequestParam userId,@RequestParam userName,@RequesParam password)
	{
		System.out.println(user.getUserName());
		model.addAttribute("key",user);
		return "userSucess";
	}*/
	//can also be written as below
	/*@PostMapping(value="/login")
	public ModelAndView loginFunction(@ModelAttribute User user) //===(@RequestParam userId,@RequestParam userName,@RequesParam password)
	{
		ModelAndView modelAndView=new ModelAndView("userSucess");
		modelAndView.addObject("key",user);
		return modelAndView;
	}*/
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
	//Validation
	@PostMapping(value="/login")
	public ModelAndView loginFunction(@Valid @ModelAttribute("alias") User user,BindingResult result) //===(@RequestParam userId,@RequestParam userName,@RequesParam password)
	{
		ModelAndView modelAndView;
		if(result.hasErrors())
		{
			//return to calling page
			//Display errors using custom tag
			return modelAndView=new ModelAndView("login");
		}
		if(user.getPassword().equals("Welcome"))
		{
			modelAndView=new ModelAndView("loginSuccess");
			//modelAndView.addObject("userkey",user);
		}
		else
		{
			modelAndView=new ModelAndView("loginFailure");
			
		}
		return modelAndView;
	}
	//Redirect b/w functions using redirect:
	/*@GetMapping(value="/one")
	public String one()
	{
		System.out.println("You were in one()+");//complete the logic
		return "redirect:two";  //will redirect to two() after completing the logic in one()
	}
	@GetMapping(value="/two")
	public String two()
	{
		System.out.println("You were also in two()+");
		return "teaBreak";
	}
	*/

}
