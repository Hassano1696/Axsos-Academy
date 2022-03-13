package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class demoController {

		public static void main(String[] args) {
			SpringApplication.run(DemoApplication.class, args);
		}
		@RequestMapping("/daikshi/{travel}/{place}")
	    public String travel( @PathVariable("travel") String travel, @PathVariable("place") String place){
	    	return "Congratulations! You will soon travel to "+ place +"!";
	    }

		@RequestMapping("/daikshi/lotto/{num}")
	    public String lotto(  @PathVariable("num") String num){
			int num_int = Integer.parseInt(num);
			if(num_int%2 ==0) {
				return "You will take a grand journey in the near future, but be weary of tempting offers";
			}else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	    }
	}
	}

