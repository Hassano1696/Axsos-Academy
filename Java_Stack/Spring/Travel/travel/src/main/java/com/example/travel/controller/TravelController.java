package com.example.travel.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.travel.models.Expense;
import com.example.travel.services.TravelService;



@Controller
public class TravelController {
	
	private final TravelService TravelService;
	public TravelController(TravelService travelService) {
		this.TravelService = travelService;
	}
	
	@GetMapping("/travels")
    public String index(Model model,@ModelAttribute("travel") Expense travel) {
        List<Expense> item = TravelService.allTravels();
        model.addAttribute("travels", item);
        return "index.jsp";
    }
	
	@PostMapping("/travels/create")
    public String create(@Valid @ModelAttribute("travel") Expense travel, BindingResult result,Model model) {
        if (result.hasErrors()) {
        	List<Expense> item = TravelService.allTravels();
            model.addAttribute("travels", item);
            return "index.jsp";
        } else {
        	TravelService.createTravel(travel);
            return "redirect:/travels";
        }
    }
	
	@GetMapping("/travels/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
		Expense item = TravelService.findTravel(id);
		model.addAttribute("travels", item);
        return "edit.jsp";
    }
	
	@PutMapping("/travels/{id}/edit/update")
    public String update(@Valid @ModelAttribute("travels") Expense item, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	TravelService.updateTravel(item);
            return "redirect:/travels";
        }
    }
	@GetMapping("/travels/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
		Expense item = TravelService.findTravel(id);
		model.addAttribute("travels", item);
        return "show.jsp";
    }
	
	@DeleteMapping("/travels/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
		TravelService.deleteTravel(id);
        return "redirect:/travels";
    }
	
	
}