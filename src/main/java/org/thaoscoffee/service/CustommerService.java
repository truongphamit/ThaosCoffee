package org.thaoscoffee.service;

import org.thaoscoffee.model.Custommer;

public interface CustommerService {
	public double totalMoney();
	public void setOderList(OderListService oderListService);
	public void setCustommer(Custommer custommer);
	public Custommer getCustommer();
}
