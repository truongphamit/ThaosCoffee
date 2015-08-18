package org.thaoscoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thaoscoffee.service.CoffeeService;
import org.thaoscoffee.service.CustommerService;
import org.thaoscoffee.service.SpicesService;

@Controller
public class MainController {
	@Autowired
	private CoffeeService coffeeService;
	@Autowired
	private SpicesService spicesService;
	@Autowired
	private CustommerService custommerService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/admin")
	public String admin(Model model) {
		model.addAttribute("listCoffees", coffeeService.findAll());
		model.addAttribute("listSpices", spicesService.findAll());
		return "admin";
	}

	@RequestMapping("/admin/historytransaction")
	public String historyTransaction(Model model) {
		model.addAttribute("listTransaction", custommerService.findAll());
		return "historytransaction";
	}

	@RequestMapping("/custommer")
	public String custommer(Model model) {
		model.addAttribute("listCoffees", coffeeService.findAll());
		model.addAttribute("listSpices", spicesService.findAll());
		return "custommer";
	}
}
