package org.thaoscoffee.service;

import java.util.List;

import org.thaoscoffee.model.Coffee;
import org.thaoscoffee.model.OderList;
import org.thaoscoffee.model.Spices;

public interface OderListService {
	public void setCoffeeOders(List<Coffee> coffees, List<Integer> quantitys);
	public void setSpicesOders(List<Spices> spices, List<Integer> quantitys);
	public OderList getOderList();
	public double totalMoney();
}
