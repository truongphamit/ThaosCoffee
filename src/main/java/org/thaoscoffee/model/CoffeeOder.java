package org.thaoscoffee.model;

public class CoffeeOder {
	private Coffee coffee;
	private int quantity;
	private double money;

	public CoffeeOder(Coffee coffee, int quantity) {
		this.coffee = coffee;
		this.quantity = quantity;
		this.money = coffee.getPrice() * quantity;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public CoffeeOder() {
	}

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalMoney() {
		return coffee.getPrice() * quantity;
	}
}
