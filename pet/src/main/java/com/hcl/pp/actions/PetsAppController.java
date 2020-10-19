
package com.hcl.pp.actions;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.pp.model.User;
import com.hcl.pp.service.UserService;

@Controller
public class PetsAppController
{

	@Autowired
	private UserService userService;
	@PostMapping(value="/register")
	public String register(Model model)
	{
		User user=new User();
		model.addAttribute("alias", user);
		return "userregn";
	}
	@PostMapping(value="/user/add")
	public ModelAndView loginFunction(@Valid @ModelAttribute("alias") User user,BindingResult result) //===(@RequestParam userId,@RequestParam userName,@RequesParam password)
	{
		ModelAndView modelAndView;
		userService.addUser(user);
		if(result.hasErrors())
		{
			return modelAndView=new ModelAndView("pet_home");
		}
		else
		{
			modelAndView=new ModelAndView("registered");
		}
		return modelAndView;
	}
	

	/*@RequestMapping("/remove/{id}")
	public String removeUser(@PathVariable("id") int id) {

		this.UserService.removeUser(id);
		return "redirect:/Users";
	}

	@RequestMapping("/edit/{id}")
	public String editUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("User", this.UserService.getUserById(id));
		model.addAttribute("listUsers", this.UserService.listUsers());
		return "User";
	}
*/
}
