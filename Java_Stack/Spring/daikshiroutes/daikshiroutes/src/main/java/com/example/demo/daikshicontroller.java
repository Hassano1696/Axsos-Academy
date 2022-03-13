package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/daikshi")
public class daikshicontroller {
@RequestMapping("")
public String welcome() {
	return ("Welcome");
}
@RequestMapping("/today")
public String today() {
	return ("Today you will find luck in all your endeavors!");
}
@RequestMapping("/tomorrow")
public String tomorrow() {
	return ("tomorrow, an opportunity will arise, so be sure to be open to new ideas!");
}

}
