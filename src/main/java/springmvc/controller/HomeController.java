package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("")
	public String redirectToContactPage() {
		return "redirect:/contact";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/contact")
	public String contactFormPage() {
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String submitFormPage(@ModelAttribute("model") User user) {
		if(!user.getPassword().equals("password")) {
			return "redirect:/contact";
		}
		System.out.println(user);
		userService.createUser(user);
		return "successContact";
	}
	
}
