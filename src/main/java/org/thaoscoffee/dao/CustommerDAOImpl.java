package org.thaoscoffee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thaoscoffee.model.Custommer;

@Repository
public class CustommerDAOImpl implements CustommerDAO{

	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Custommer custommer) {
		sessionFactory.getCurrentSession().persist(custommer);
		
	}

	@Override
	public void delete(int idTransaction) {
		Session session = sessionFactory.getCurrentSession();
		Custommer custommer = (Custommer) session.get(Custommer.class, idTransaction);
		if (custommer != null) {
			session.delete(custommer);
		}
		
	}

	@Override
	public Custommer findByID(int idTransaction) {
		return (Custommer) sessionFactory.getCurrentSession().get(Custommer.class, idTransaction);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Custommer> findAll() {
		return (List<Custommer>) sessionFactory.getCurrentSession().createQuery("from Custommer").list();
	}

}
