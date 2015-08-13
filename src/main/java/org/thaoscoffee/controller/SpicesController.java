package org.thaoscoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thaoscoffee.model.Spices;
import org.thaoscoffee.service.SpicesService;

@Controller
public class SpicesController {
	@Autowired
	private SpicesService spicesService;

	@RequestMapping("/admin/addspices")
	public String addSpices() {
		return "addspices";
	}

	@RequestMapping(value = "/admin/addspices", method = RequestMethod.POST)
	public String addSpices(@ModelAttribute("spices") Spices spices) {
		if (spices.getId() == 0) {
			spicesService.add(spices);
		} else {
			spicesService.edit(spices);
		}
		return "redirect:/admin";
	}

	@RequestMapping(value = "/admin/removespices/{id}", method = RequestMethod.POST)
	public String removespices(@PathVariable("id") Integer id) {
		spicesService.delete(id);
		return "redirect:/admin";
	}

	@RequestMapping(value = "/admin/editspices/{id}")
	public String editSpices(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("item", spicesService.findByID(id));
		return "editspices";
	}
}
