package springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
//	@Autowired
//	@Qualifier("contactValidator")
//	private Validator validator;

//	@InitBinder
//   private void initBinder(WebDataBinder binder) {
//      binder.setValidator(validator);
//   }
	
	@RequestMapping("")
	public String redirectToContactPage() {
		return "redirect:/contact";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/contact")
	public String contactFormPage(Model model) {
		model.addAttribute("user", new User());
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String submitFormPage(@ModelAttribute("user") @Valid User user, BindingResult result) {
		System.out.println("result checking1: "+ result);
		//for exception
		//throw new NullPointerException();
		/**/
		if(result.hasErrors()) {
			System.out.println("got error: " + result);
			return "contact";
		}
		System.out.println("result checked");
		userService.createUser(user);
		return "successContact";
	}
	
//	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(value= Exception.class)
//	public String handleException() {
//		return "error";
//	}
//	
}
