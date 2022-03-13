package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellohumancontroller {


	@RequestMapping("")
	 public String index(@RequestParam(value="q", required=false, defaultValue="Human") String name){

			return ("Welcome " + name);
		}
	
}
