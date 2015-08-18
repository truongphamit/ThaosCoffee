package org.thaoscoffee.dao;

import java.util.List;

import org.thaoscoffee.model.Custommer;

public interface CustommerDAO {
	public void add(Custommer custommer);
	public void delete(int idTransaction);
	public Custommer findByID(int idTransaction);
	public List<Custommer> findAll();
}
