package org.thaoscoffee.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "transaction_history")
public class Custommer {
	@Id
	@Column(name = "id_transaction")
	private int idTransaction;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "age")
	private int age;
	
	@Transient
	private OderList oderList;
	
	@Column(name = "money")
	private double money;
	
	@Column(name = "datetime")
	private Timestamp datetime;
	
	public Timestamp getDatetime() {
		return datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

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
