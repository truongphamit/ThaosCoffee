package org.thaoscoffee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thaoscoffee.dao.SpicesDAO;
import org.thaoscoffee.model.Spices;

@Service
@Transactional
public class SpicesServiceImpl implements SpicesService {

	@Autowired
	private SpicesDAO spicesDAO;

	@Override
	public void add(Spices t) {
		spicesDAO.add(t);
	}

	@Override
	public void edit(Spices t) {
		spicesDAO.edit(t);

	}

	@Override
	public void delete(Integer id) {
		spicesDAO.delete(id);

	}

	@Override
	public Spices findByID(Integer id) {
		return spicesDAO.findByID(id);
	}

	@Override
	public List<Spices> findAll() {
		return spicesDAO.findAll();
	}

}
