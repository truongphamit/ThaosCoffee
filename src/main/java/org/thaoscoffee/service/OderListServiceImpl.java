package org.thaoscoffee.service;

import java.util.List;

import org.thaoscoffee.model.Coffee;
import org.thaoscoffee.model.CoffeeOder;
import org.thaoscoffee.model.OderList;
import org.thaoscoffee.model.Spices;
import org.thaoscoffee.model.SpicesOder;

public class OderListServiceImpl implements OderListService {
	private OderList oderList = new OderList();

	public OderListServiceImpl() {
	}

	public OderList getOderList() {
		return oderList;
	}

	public void setOderList(OderList oderList) {
		this.oderList = oderList;
	}

	@Override
	public void setCoffeeOders(List<Coffee> coffees, List<Integer> quantitys) {
		for (int i = 0; i < coffees.size(); i++) {
			if (quantitys.get(i) > 0) {
				oderList.getCoffeeOders().add(new CoffeeOder(coffees.get(i), quantitys.get(i)));
			}
		}
	}

	@Override
	public void setSpicesOders(List<Spices> spices, List<Integer> quantitys) {
		for (int i = 0; i < spices.size(); i++) {
			if (quantitys.get(i) > 0) {
				oderList.getSpicesOders().add(new SpicesOder(spices.get(i), quantitys.get(i)));
			}
		}
	}

	@Override
	public double totalMoney() {
		return oderList.totalMoney();
	}

}
