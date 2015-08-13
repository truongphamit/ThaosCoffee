package org.thaoscoffee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thaoscoffee.dao.CoffeeDAO;
import org.thaoscoffee.model.Coffee;

@Service
@Transactional
public class CoffeeServiceimpl implements CoffeeService {

	@Autowired
	private CoffeeDAO coffeeDAO;

	@Override
	public void add(Coffee t) {
		coffeeDAO.add(t);
	}

	@Override
	public void edit(Coffee t) {
		coffeeDAO.edit(t);

	}

	@Override
	public void delete(Integer id) {
		coffeeDAO.delete(id);

	}

	@Override
	public Coffee findByID(Integer id) {
		return coffeeDAO.findByID(id);
	}

	@Override
	public List<Coffee> findAll() {
		return coffeeDAO.findAll();
	}

}
