package org.thaoscoffee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thaoscoffee.dao.CustommerDAO;
import org.thaoscoffee.model.Custommer;

@Service
@Transactional
public class CustommerServiceImpl implements CustommerService {
	private Custommer custommer;

	@Autowired
	private CustommerDAO custommerDAO;

	public CustommerServiceImpl() {
	}

	public Custommer getCustommer() {
		return custommer;
	}

	public void setCustommer(Custommer custommer) {
		this.custommer = custommer;
	}

	@Override
	public void setOderList(OderListService oderListService) {
		custommer.setOderList(oderListService.getOderList());
	}

	@Override
	public void add(Custommer custommer) {
		custommerDAO.add(custommer);

	}

	@Override
	public void delete(int idTransaction) {
		custommerDAO.delete(idTransaction);
	}

	@Override
	public Custommer findByID(int idTransaction) {
		return custommerDAO.findByID(idTransaction);
	}

	@Override
	public List<Custommer> findAll() {
		return custommerDAO.findAll();
	}

}
