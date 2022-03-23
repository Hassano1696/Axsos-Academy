package com.example.demo.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.LoginUser;
import com.example.demo.models.User;
import com.example.demo.services.UserService;

@Controller
public class UserController {

	@Autowired
    private UserService userServ;
	
	  @GetMapping("/")
	    public String form(Model model) {
	    
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "index.jsp";
	    }
	  @PostMapping("/register")
		public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
				HttpSession session) {

			User registeredUser = userServ.register(newUser, result);

			if (result.hasErrors()) {
				model.addAttribute("newLogin", new LoginUser());
				return "index.jsp";
			}

			session.setAttribute("userId", registeredUser.getId());
			return "redirect:/success";
		}
	  
	   @PostMapping("/login")
		public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
				HttpSession session) {

			User user = userServ.login(newLogin, result);

			if (result.hasErrors()) {
				model.addAttribute("newUser", new User());
				return "index.jsp";
			}

			session.setAttribute("userId", user.getId());

			return "redirect:/success";

		}
	   
		@GetMapping("/success")
		public String success(Model model, HttpSession session) {
			if (session.getAttribute("userId") != null) {
				User loggedUser = userServ.findUserById((long) session.getAttribute("userId"));
				model.addAttribute("loggedUser", loggedUser);
				return "welcome.jsp";
			}
			return "redirect:/home";
		}
		@GetMapping("/logout")
		public String logout(Model model, HttpSession session) {
			session.invalidate();
			return "redirect:/";
		}

}