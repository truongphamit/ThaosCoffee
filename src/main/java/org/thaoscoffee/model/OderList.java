package org.thaoscoffee.model;

import java.util.ArrayList;
import java.util.List;

public class OderList {
	private List<CoffeeOder> coffeeOders = new ArrayList<>();
	private List<SpicesOder> spicesOders = new ArrayList<>();

	public List<CoffeeOder> getCoffeeOders() {
		return coffeeOders;
	}

	public void setCoffeeOders(List<CoffeeOder> coffeeOders) {
		this.coffeeOders = coffeeOders;
	}

	public List<SpicesOder> getSpicesOders() {
		return spicesOders;
	}

	public void setSpicesOders(List<SpicesOder> spicesOders) {
		this.spicesOders = spicesOders;
	}

	public OderList(List<CoffeeOder> coffeeOders, List<SpicesOder> spicesOders) {
		this.coffeeOders = coffeeOders;
		this.spicesOders = spicesOders;
	}

	public OderList() {
	}
	
	public double totalMoney() {
		double sum = 0;
		for (CoffeeOder c : coffeeOders) {
			if (c.getQuantity() != 0) {
				sum += c.totalMoney();
			}
		}
		
		for (SpicesOder s : spicesOders) {
			if (s.getQuantity() != 0) {
				sum += s.totalMoney();
			}
		}
		return sum;
	}
}
