package org.thaoscoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thaoscoffee.model.Coffee;
import org.thaoscoffee.service.CoffeeService;

@Controller
public class CoffeeController {

	@Autowired
	private CoffeeService coffeeService;

	@RequestMapping("/admin/addcoffee")
	public String addCoffee() {
		return "addcoffee";
	}

	@RequestMapping(value = "/admin/addcoffee", method = RequestMethod.POST)
	public String addCoffee(@ModelAttribute("coffee") Coffee coffee) {
		if (coffee.getId() == 0) {
			coffeeService.add(coffee);
		} else {
			coffeeService.edit(coffee);
		}
		return "redirect:/admin";
	}

	@RequestMapping(value = "/admin/removecoffee/{id}", method = RequestMethod.POST)
	public String removecoffee(@PathVariable("id") Integer id) {
		coffeeService.delete(id);
		return "redirect:/admin";
	}
	
	@RequestMapping(value = "/admin/editcoffee/{id}")
	public String editCoffee(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("item", coffeeService.findByID(id));
		return "editcoffee";
	}
}
