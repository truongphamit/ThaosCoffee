package org.thaoscoffee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thaoscoffee.model.Spices;

@Repository
public class SpicesDAOImpl implements SpicesDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Spices t) {
		sessionFactory.getCurrentSession().persist(t);

	}

	@Override
	public void edit(Spices t) {
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		Spices spices = (Spices) session.load(Spices.class, id);
		if (null != spices) {
			session.delete(spices);
		}

	}

	@Override
	public Spices findByID(Integer id) {
		return (Spices) sessionFactory.getCurrentSession().get(Spices.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Spices> findAll() {
		return (List<Spices>) sessionFactory.getCurrentSession().createQuery("from Spices").list();
	}

}
