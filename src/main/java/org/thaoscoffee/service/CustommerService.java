package org.thaoscoffee.service;

import java.util.List;

import org.thaoscoffee.model.Custommer;

public interface CustommerService {
	public void setOderList(OderListService oderListService);
	public void setCustommer(Custommer custommer);
	public Custommer getCustommer();
	public void add(Custommer custommer);
	public void delete(int idTransaction);
	public Custommer findByID(int idTransaction);
	public List<Custommer> findAll();
}
