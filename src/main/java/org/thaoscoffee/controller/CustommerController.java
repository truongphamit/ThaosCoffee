package org.thaoscoffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thaoscoffee.model.Custommer;
import org.thaoscoffee.service.CoffeeService;
import org.thaoscoffee.service.CustommerService;
import org.thaoscoffee.service.OderListService;
import org.thaoscoffee.service.SpicesService;

@Controller
public class CustommerController {

	@Autowired
	private CoffeeService coffeeService;

	@Autowired
	private SpicesService spicesService;

	@Autowired
	private OderListService oderListService;

	@Autowired
	private CustommerService custommerService;

	@RequestMapping(value = "/custommer/oder", method = RequestMethod.GET)
	public String oder(@ModelAttribute("") Custommer custommer,
			@RequestParam("coffeeQuantity") List<Integer> coffeeQuantitys,
			@RequestParam("spicesQuantity") List<Integer> spicesQuantitys, Model model) {
		custommerService.setCustommer(custommer);
		oderListService.setCoffeeOders(coffeeService.findAll(), coffeeQuantitys);
		oderListService.setSpicesOders(spicesService.findAll(), spicesQuantitys);
		custommerService.setOderList(oderListService);
		custommerService.getCustommer().setMoney(oderListService.totalMoney());
		model.addAttribute("custommer", custommerService.getCustommer());
		return "oder";
	}

	@RequestMapping(value = "/custommer/oder/cancel")
	public String cancel() {
		return "redirect:/custommer";
	}

	@RequestMapping(value = "/custommer/oder/pay", method = RequestMethod.GET)
	public String pay(Model model) {
		Custommer custommer = custommerService.getCustommer();
		custommerService.add(custommer);
		model.addAttribute("custommer", custommer);
		return "pay";
	}
}
