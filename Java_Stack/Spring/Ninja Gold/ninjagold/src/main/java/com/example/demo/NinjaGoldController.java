package com.example.demo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {

	@GetMapping("/")
	public String home(HttpSession session, Model model) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}

			return "index.jsp";
		}



	@PostMapping("/find")
	public String getGold(HttpSession session, @RequestParam(value = "which_form") String which_form) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd YYYY K:mm a");
		int gold = (int) session.getAttribute("gold");
			int earning;
			if (which_form.equals("Farm")) {
				earning =  (int)Math.floor((Math.random()*(11))+10);
				session.setAttribute("gold", gold += earning);
				if (session.getAttribute("messages") == null) {
					session.setAttribute("messages",
							String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
									which_form, earning, sdf.format(new Date())));

				} else {
					String messages = (String) session.getAttribute("messages");
					messages = String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
							which_form, earning, sdf.format(new Date())) + messages;
					session.setAttribute("messages", messages);
				}


			} else if (which_form.equals("Cave")) {
				earning = (int) Math.floor(Math.random() * 6) + 5;
				session.setAttribute("gold", gold += earning);
				if (session.getAttribute("messages") == null) {
					session.setAttribute("messages",
							String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
									which_form, earning, sdf.format(new Date())));

				} else {
					String messages = (String) session.getAttribute("messages");
					messages = String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
							which_form, earning, sdf.format(new Date())) + messages;
					session.setAttribute("messages", messages);
				}

			} else if (which_form.equals("House")) {
				earning = (int) Math.floor(Math.random() * 4) +2;
				session.setAttribute("gold", gold += earning);
				if (session.getAttribute("messages") == null) {
					session.setAttribute("messages",
							String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
									which_form, earning, sdf.format(new Date())));

				} else {
					String messages = (String) session.getAttribute("messages");
					messages = String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
							which_form, earning, sdf.format(new Date())) + messages;
					session.setAttribute("messages", messages);
				}

		
			} else if (which_form.equals("Quest")) {
				int which = (int) Math.floor(Math.random() * 2 );
				if (which==1) {
					earning = (int) Math.floor(Math.random() * 51) ;
					session.setAttribute("gold", gold += earning);


					if (session.getAttribute("messages") == null) {
						session.setAttribute("messages",
								String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
										which_form, earning, sdf.format(new Date())));

					} else {
						String messages = (String) session.getAttribute("messages");
						messages = String.format("<p class='text-success'>You have entered the %s and earned %d golds (%s)</p>",
								which_form, earning, sdf.format(new Date())) + messages;
						session.setAttribute("messages", messages);
					}

					
				}

				else  {
					earning = (int) Math.floor(Math.random() * 51);
					session.setAttribute("gold", gold -= earning);

					if (session.getAttribute("messages") == null) {
						session.setAttribute("messages",
								String.format("<p class='text-danger'>You have entered the %s and lost %d golds (%s)</p>",
										which_form, earning, sdf.format(new Date())));
						

					} else {
						String messages = (String) session.getAttribute("messages");
						messages = String.format("<p class='text-danger'>You have entered the %s and lost %d golds (%s)</p>",
								which_form, earning, sdf.format(new Date())) + messages;
						session.setAttribute("messages", messages);
					}

					
				}

		
			}
		return "redirect:/";
	}


}