package org.thaoscoffee.dao;

import java.util.List;

public interface DAO<T> {
	public void add(T t);
	public void edit(T t);
	public void delete(Integer id);
	public T findByID(Integer id);
	public List<T> findAll();
}
