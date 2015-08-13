package org.thaoscoffee.service;


import org.thaoscoffee.model.Custommer;

public class CustommerServiceImpl implements CustommerService {
	private Custommer custommer;
	public CustommerServiceImpl() {
	}

	public Custommer getCustommer() {
		return custommer;
	}

	public void setCustommer(Custommer custommer) {
		this.custommer = custommer;
	}

	@Override
	public double totalMoney() {
		return custommer.totalMoney();
	}

	@Override
	public void setOderList(OderListService oderListService) {
		custommer.setOderList(oderListService.getOderList());
	}

}
