package org.thaoscoffee.model;

public class Custommer {
	private int idTransaction;
	private String name;
	private String address;
	private String id;
	private String phoneNumber;
	private int age;
	private OderList oderList;
	private double money;

	public Custommer() {
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public OderList getOderList() {
		return oderList;
	}

	public void setOderList(OderList oderList) {
		this.oderList = oderList;
	}

	public Custommer(String name, String address, String id, String phoneNumber, int age) {
		this.name = name;
		this.address = address;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double totalMoney() {
		return oderList.totalMoney();
	}
}
