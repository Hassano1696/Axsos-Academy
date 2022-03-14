package com.example.demo;

import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication

@RequestMapping("/omikuji")
@Controller
	

public class OmikujiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmikujiApplication.class, args);
	}
	@RequestMapping("")	
	public String main() {
		return ("index.jsp");
	}


	@RequestMapping(value="/process", method=RequestMethod.POST)	
	public String send(HttpSession session,
			@RequestParam(value="number") Integer number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="animal") String animal,
			@RequestParam(value="nice") String nice) {
		session.setAttribute("number",number);
		session.setAttribute("city",city);
		session.setAttribute("person",person);
		session.setAttribute("hobby",hobby);
		session.setAttribute("animal",animal);
		session.setAttribute("nice",nice);
        System.out.println("Your total savings is--$" );

		return ("redirect:/omikuji/show");
	}
	
	
	@RequestMapping("/show")	
	public String show(Model model, HttpSession session) {
		model.addAttribute("number", (Integer) session.getAttribute("number"));
		model.addAttribute("city", (String) session.getAttribute("city"));
		model.addAttribute("person", (String) session.getAttribute("person"));
		model.addAttribute("hobby", (String) session.getAttribute("hobby"));
		model.addAttribute("animal", (String) session.getAttribute("animal"));
		model.addAttribute("nice", (String) session.getAttribute("nice"));
		return ("show.jsp");
	}
	
}
