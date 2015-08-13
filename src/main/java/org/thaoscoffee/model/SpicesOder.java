package org.thaoscoffee.model;

public class SpicesOder {
	private Spices spices;
	private int quantity;
	private double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public SpicesOder(Spices spices, int quantity) {
		this.spices = spices;
		this.quantity = quantity;
		this.money = spices.getPrice() * quantity;
	}

	public SpicesOder() {
	}

	public Spices getSpices() {
		return spices;
	}

	public void setSpices(Spices spices) {
		this.spices = spices;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalMoney() {
		return spices.getPrice() * quantity;
	}
}
